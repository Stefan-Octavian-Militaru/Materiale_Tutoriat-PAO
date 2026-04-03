public class Manager extends Employee{
    private double percent;

    Manager(String name, int salary, double percent){
        super(name,salary);
        this.percent = percent;

    }

    @Override
    protected double calculateSalary(){return salary + salary * percent;}
}
