public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String university;
    private double grade;

    public Student(String name, int age, String university, double grade) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGrade(), this.grade);
    }
}
