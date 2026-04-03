import java.util.Locale;

public class Author {
    String first_name;
    String last_name;

    Author(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString(){
        return first_name.toLowerCase() + " " + last_name.toUpperCase();
    }
}
