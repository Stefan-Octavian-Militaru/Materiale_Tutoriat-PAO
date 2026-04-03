import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<Book>(); //var 1
//        Book[] booksArray = new Book[10]; //var 2
//
//        Author author1 = new Author("John", "Smith");
//        Author author2 = new Author("Jane", "Doe");
//        Author author3 = new Author("Bob", "Ton");
//
//        Book book1 = new Book("The Lion King", author1, "abc123");
//        Book book2 = new Book("The Wonder", author2, "1234567891234");
//        Book book3 = new Book("Inside Out", author3, "zxcabc1237");
//
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//
//        Borrow borrow1 = new Borrow(books.get(0), "Maria Dumitru");
//        System.out.println(borrow1.clientName() + " " + borrow1.book().getTitle());
//
//        for (Book book : books){
//            System.out.println("The book title: " + book.getTitle().toUpperCase());
//            System.out.println("The author: " + book.getAuthor().toString());
//        }

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(2.0, 2.0);
        shapes[1] = new Circle(1.0);
        shapes[2] = new Rectangle(1.0, 2.0);

        for (Shape shape : shapes){
            System.out.println(shape.area());
            System.out.println(shape.volume());
            System.out.println(shape.toString());
        }

    }
}