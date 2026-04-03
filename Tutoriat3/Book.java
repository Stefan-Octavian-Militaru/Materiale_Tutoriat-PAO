import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    String title;
    Author author;
    final String ISBN;

    Book(String title, Author author, String ISBN) {
        this.title = title;
        this.author = author;
        Pattern ISBNPattern = Pattern.compile("[0-9]{13}");
        Matcher matcher = ISBNPattern.matcher(ISBN);
        if (matcher.matches()) {
            this.ISBN = ISBN;
        } else {
            System.out.println("Invalid ISBN");
            this.ISBN = null;
        }
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }


}
