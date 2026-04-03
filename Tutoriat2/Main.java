//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Product p = new Product("Pasta", 10);
//        System.out.println(p.toString());
//        p.applySale(0.2);
//        System.out.println(p.toString());
//        Product p2 = new Product("Cerial", 10);
//        Product p3 = new Product("Pasta", 8);
//        System.out.println(p.equals(p2));
//        System.out.println(p.equals(p3));
//        System.out.println(p.getContor());

        Employee[] employees = new Employee[2];
        employees[0] = new Programmar("John", 2000, 400);
        employees[1] = new Manager("Mike", 3000, 0.2);

        for (Employee e : employees){
            System.out.println(e.calculateSalary());}
        }

}