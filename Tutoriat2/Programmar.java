public class Programmar extends Employee{
    private int bonus;

    Programmar(String name, int salary, int bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    protected double calculateSalary(){return salary + bonus;}


}
