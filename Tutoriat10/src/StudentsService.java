import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentsService {
    Connection conn;

    public StudentsService() throws SQLException {
        TestConection testCon = new TestConection();
        this.conn = testCon.connect();
    }

    public ArrayList<Student> getAllStudents() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from students");
        ArrayList<Student> students = new ArrayList<>();
        while (rs.next()) {
            Student st = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getDouble("average"));
            students.add(st);
        }
        return students;
    }

    public void insertStudent() throws SQLException, IOException {
        PreparedStatement stmt = conn.prepareStatement("insert into students values(?,?,?,?)");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student ID, Name, Age, Average: ");
        String s = r.readLine();
        String[] pList = s.split(" ");
        stmt.setInt(1, Integer.parseInt(pList[0]));
        stmt.setString(2, pList[1]);
        stmt.setInt(3, Integer.parseInt(pList[2]));
        stmt.setDouble(4, Double.parseDouble(pList[3]));

        stmt.executeUpdate();
        System.out.println("Student was inserted!");
    }

    public ArrayList<Student> getStudentName(String name) throws SQLException {
        ArrayList<Student> students = getAllStudents();
        return (ArrayList<Student>) students.stream().filter(x -> Objects.equals(x.getName(), name)).collect(Collectors.toList());
    }

    public void increaseAverage(int id, double amount) throws SQLException, IOException {
        PreparedStatement stmt = conn.prepareStatement("select average from students where id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        double average = 0;
        while (rs.next()) {
            average = rs.getDouble("average");
        }
        amount = amount + average;
        if (amount > 10) {
            amount = 10;
        }
        stmt.close();
        PreparedStatement stmt2 = conn.prepareStatement("update students set average = ? where id = ?");
        stmt2.setDouble(1, amount);
        stmt2.setInt(2, id);
        stmt2.executeUpdate();
        stmt2.close();
    }

    public void deleteStudent(int id) throws SQLException, IOException {
        PreparedStatement stmt2 = conn.prepareStatement("select * from students where id = ?");
        stmt2.setInt(1, id);
        ResultSet rs = stmt2.executeQuery();
        if (rs.next()) {
            System.out.println("Student was removed!");
            PreparedStatement stmt = conn.prepareStatement("delete from students where id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } else {
            System.out.println("Student does not exist!");
        }
    }
}
