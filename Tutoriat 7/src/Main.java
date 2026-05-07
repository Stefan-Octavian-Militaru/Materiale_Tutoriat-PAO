import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        //ex1
//            ArrayList<Student> students = new ArrayList<Student>();
//            Student s1 = new Student("John Doe", 7.5F);
//            students.add(s1);
//            Student s2 = new Student("Marie Smith", 9);
//            students.add(s2);
//            Student s3 = new Student("Alex John", 10);
//            students.add(s3);
//            Student s4 = new Student("Ioana Mihai", 6.5F);
//            students.add(s4);
//            Student s5 = new Student("Alexia Grigore", 4);
//            students.add(s5);
//            for (int i = 0; i < students.size() - 1; i++) {
//                for (int j = i + 1; j < students.size(); j++) {
//                    if (students.get(i).getMedie() < students.get(j).getMedie()) {
//                        Student temp = students.get(i);
//                        students.set(i, students.get(j));
//                        students.set(j, temp);
//                    }
//                }
//            }
//            for (int i = 0; i < students.size(); i++) {
//                System.out.println(students.get(i).toString());
//            }
//        System.out.println();
//            Iterator<Student> iterator = students.iterator();
//            while (iterator.hasNext()) {
//                Student student = iterator.next();
//                if (student.getMedie() < 5) {
//                    iterator.remove();
//                }
//            }
//
//            for (int i = 0; i < students.size(); i++) {
//                System.out.println(students.get(i).toString());
//            }
        // ex 2
//        ArrayList<Integer> ex2_valori = new ArrayList<>();
//        ex2_valori.add(1);
//        ex2_valori.add(2);
//        ex2_valori.add(3);
//        ex2_valori.add(2);
//        ex2_valori.add(4);
//        ex2_valori.add(1);
//        ex2_valori.add(5);
//        ex2_valori.add(3);
//        LinkedHashSet<Integer> valori_unice = new LinkedHashSet<>(ex2_valori);
//        Iterator<Integer> iterator = valori_unice.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //ex3
//        String text = "ana are pere si ana are mere";
//        ArrayList<String> arr = new ArrayList<>(Arrays.asList(text.split(" ")));
//        HashMap<String, Integer> hmap = new HashMap<>();
//        for (String s : arr) {
//            if (hmap.containsKey(s)) {
//                hmap.put(s,hmap.get(s) + 1);
//            }
//            else {
//                hmap.put(s,1);
//            }
//        }
//        for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        System.out.println("TreeMap: ");
//        TreeMap<String, Integer> treeMap = new TreeMap<>(hmap);
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        //ex4
        Agenda agenda = new Agenda();
        agenda.addPerson("John", "0765432156");
        agenda.addPerson("Jane", "0767542316");
        agenda.addPerson("Amelie", "0723458765");
        agenda.addPerson("Bob", "0734567890");
        agenda.addPerson("David", "0734567890");

        agenda.searchPerson("David");

        agenda.removePerson("Jane");

        System.out.println("Sorted contacts:");
        agenda.sortedContacts();



    }
}