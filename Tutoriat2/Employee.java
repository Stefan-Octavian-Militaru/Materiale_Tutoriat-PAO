public abstract class Employee {
    protected String name;
    protected int salary;

    protected abstract double calculateSalary();

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }


}


