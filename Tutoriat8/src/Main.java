import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //ex1
//        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10, 21, 100, 3));
//        Predicate<Integer> predicate = x -> x % 2 == 0 && x < 17;
//        for (Integer i : list) {
//            if (predicate.test(i)) {
//                System.out.println(i);
//            }
//        }
//        // with lambda functions
//        ArrayList<Integer> arr = new ArrayList<>();
//        TestNumber testNumberObject = x -> x % 2 == 0 && x < 17;
//        for (Integer i : list) {
//            if (testNumberObject.testNumber(i)) {
//                arr.add(i);
//            }
//        }
//        arr.forEach(System.out::println);

        // ex2
//        RandomNumberGenerator rng = new RandomNumberGenerator();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(rng.generateEvenNumbers(1, 100));
//        }

        //ex3
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Maria", "Eduard", "Alex", "andrei", "AnA", "in", ""));
//        CapitaliseName capitaliseNameObject = String::toUpperCase;
//        Predicate<String> testName = nume -> nume.length() > 2;
//        ArrayList<String> auxNames = new ArrayList<>();
//        for (String name : names) {
//            if (testName.test(name)) {
//                auxNames.add(capitaliseNameObject.capitalize(name));
//            }
//        }
//        auxNames.forEach(System.out::println);

        //ex4
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Gigel", 7));
//        students.add(new Student("Michael", (float)6.6));
//        students.add(new Student("John", 10));
//
//        students.sort(Comparator.comparing(Student::getName));
//        students.forEach(System.out::println);
//
//        System.out.println();
//
//        students.sort(Comparator.comparing(Student::getAverage).reversed());
//        students.forEach(System.out::println);

        //ex5
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Milk", "Dairy", 1, 100));
        products.add(new Product("Pepsi", "Soda", 2, 50));
        products.add(new Product("Fanta", "Soda", 2, 20));
        products.add(new Product("Biscuits", "Sweets", 3, 50));
        products.add(new Product("Chocolate", "Sweets", 4, 4));
        products.add(new Product("Cheese", "Dairy", 5, 100));
        products.add(new Product("Laptop", "Electronics", 700, 10));
        products.add(new Product("Keyboard", "Electronics", 120, 3));

        Predicate<Product> checkStock = x -> x.getStock() < 5;
        for (Product product : products) {
            if (checkStock.test(product)) {
                System.out.println(product);
            }
        }

        Function<Product, Integer> calculateStock = x -> x.getStock() * x.getPrice();
        int totalStock = 0;
        for (Product product : products) {
           totalStock += calculateStock.apply(product);
        }
        System.out.println("Total stock: " + totalStock);

        Comparator<Product> comparator = Comparator.comparing(Product::getCategory).thenComparing(Product::getPrice);
        products.sort(comparator);
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        Predicate<Product> checkElectronics = x -> Objects.equals(x.getCategory(), "Electronics");
        Consumer<Product> applyReduction = x -> x.setPrice((int)(x.getPrice() * 0.9));
        for (Product product : products) {
            if (checkElectronics.test(product)) {
                applyReduction.accept(product);
            }
        }
        products.forEach(System.out::println);

        products.forEach(x -> System.out.println(x.getName()));


    }
}