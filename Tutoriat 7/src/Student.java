public class Student {
    String nume;
    float medie;

    Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    float getMedie() {
        return medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }
}
