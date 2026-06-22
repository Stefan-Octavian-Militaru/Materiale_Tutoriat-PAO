import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
//        TestConection testConection = new TestConection();
//        testConection.connect();

        StudentsService studentsService = new StudentsService();
        ArrayList<Student> students = studentsService.getAllStudents();
        students.forEach(System.out::println);

//        studentsService.insertStudent();
//        System.out.println();
//        System.out.println(studentsService.getStudentName("Ioana").get(0));
//
//        System.out.println();
//        studentsService.increaseAverage(3, 0.5);
//
//        studentsService.deleteStudent(10);

        Server server = new Server();
        server.listen();



    }
}