import java.util.HashMap;
import java.util.TreeMap;

public class Agenda {
    HashMap<String, String> hs;

    Agenda() {
        hs = new HashMap<>();
    }

    void addPerson(String nume, String nr_telefon) {
        hs.put(nume, nr_telefon);
    }

    void searchPerson(String nume) {
        if (hs.containsKey(nume)) {
            System.out.println(nume + " " + hs.get(nume));
        }
    }

    void removePerson(String nume) {
        hs.remove(nume);
    }

    void sortedContacts(){
        TreeMap<String, String> sorted = new TreeMap<>(hs);
        for (String key : sorted.keySet()) {
            System.out.println(key + " " + sorted.get(key));
        }
    }
}
