import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //1
//        //a
//        Student student1 = new Student("Alin", 19, "UNIBUC", 7);
//        Student student2 = new Student("Maria", 20, "UNIBUC", 2);
//        Student student3 = new Student("Matei", 17, "POLI", 7.5);
//        Student student4 = new Student("John", 18, "POLI", 4);
//        Student student5 = new Student("Ioana", 22, "Litere", 10);
//        Student student6 = new Student("Michael", 23, "Medicina", 5);
//
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//        students.add(student6);
//
//        //b
//        students.stream().filter(x -> x.getGrade() >= 5).forEach(System.out::println);
//
//        //c
//        List<String> arr = students.stream().map(x -> x.getName().toUpperCase()).sorted().collect(Collectors.toList());
////        for (String s : arr) {
////            System.out.println(s);
////        }
//        arr.forEach(System.out::println);
//
//        //d
//        long nr_students_UNIBUC = students.stream().filter(x -> Objects.equals(x.getUniversity(), "UNIBUC")).count();
//        System.out.println(nr_students_UNIBUC);
//
//        //e
//        boolean minor_student = students.stream().anyMatch(student -> student.getGrade() < 18);
//        System.out.println(minor_student);
//
//        //f
//        Student studentHighestGr = students.stream().sorted().findFirst().get();
//        System.out.println(studentHighestGr);
//
//        //g
//        students.stream().sorted().limit(3).forEach(System.out::println);

        //ex2

        //a
        Order order1 = new Order(1, "Lapte", 7, 2, true);
        Order order2 = new Order(2, "Ciocolata", 12, 3, false);
        Order order3 = new Order(3, "Ciocolata", 12, 3, true);
        Order order4 = new Order(4, "Mustar", 9, 1, false);
        Order order5 = new Order(5, "Covrigei", 5, 5, true);
        Order order6 = new Order(6, "Branza", 15, 2, true);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);

        //b
        orders.stream().filter(Order::isDelivered).forEach(System.out::println);

        //c
        List<String> distinctOrders = orders.stream().map(Order::getProduct).distinct().toList();
        System.out.println(distinctOrders);

        //d
        double total  = orders.stream().map(Order::getQuantity).reduce(0, (x, y) -> x + y);
        System.out.println(total);

        //e
        orders.stream().sorted().forEach(System.out::println);

        //f
        boolean positiveValue = orders.stream().allMatch( x -> x.getQuantity() > 0);
        System.out.println(positiveValue);

        //g
        Order smallestOrder = orders.stream().sorted((a,b) -> Double.compare(a.getPrice(), b.getPrice())).findFirst().get();
        System.out.println(smallestOrder);

        //h
        orders.stream().sorted().limit(2).forEach(System.out::println);

        //i
        orders.stream().skip(3).forEach(System.out::println);

        //3
        Stream<String> stream = Stream.of("java",
                "stream",
                "lambda",
                "programare",
                "java",
                "colectii",
                "functional",
                "stream");

        //a
        stream.filter(x -> x.length() > 5).forEach(System.out::println);

        List<String> words = Arrays.asList("java", "stream",
                "lambda",
                "programare",
                "java",
                "colectii",
                "functional",
                "stream");

        //b
        List<String> capitalLetters = words.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(capitalLetters);

        //c
        List<String> c_ex3 = words.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(c_ex3);

        //d
        int caractere = words.stream().map(x -> x.length()).peek(System.out::println).reduce(0, (x, y) -> x + y);
        System.out.println(caractere);

        //e
        boolean zExist = words.stream().map(x -> x.toLowerCase()).anyMatch(x -> x.contains("z"));
        System.out.println(zExist);

        //f
        String maxCuv  = words.stream().max(Comparator.comparing(x -> x.length())).get();
        System.out.println(maxCuv);

        //g
        String newString = words.stream().reduce("", (x,y) -> x + ", " + y);
        System.out.println(newString);

        //h
        // done at d)




    }
}