public class Student {
    private int id;
    private String name;
    private int age;
    private double average;

    public Student(int id, String name, int age, double average) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }
}
