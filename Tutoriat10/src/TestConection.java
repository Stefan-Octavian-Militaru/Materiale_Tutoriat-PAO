import java.sql.*;

public class TestConection {
    public Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/university",
                        "root",
                        "parola");

        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("select * from students");
//        while (rs.next()) {
//            System.out.println(rs.getString("name"));
//        }
//        stmt.executeUpdate("INSERT INTO students VALUES (2, 'Alex', 20, 10)");
//        stmt.executeUpdate("INSERT INTO students VALUES (3, 'Bob', 22, 7)");
//        stmt.executeUpdate("INSERT INTO students VALUES (4, 'James', 21, 8.5)");
        return conn;

    }


}
