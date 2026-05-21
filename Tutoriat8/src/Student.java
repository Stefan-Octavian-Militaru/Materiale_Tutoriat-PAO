public class Student {
    private String name;
    private float average;

    public Student(String name, float average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public float getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
