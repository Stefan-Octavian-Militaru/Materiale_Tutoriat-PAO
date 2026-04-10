public interface AnotherPrinter {
    default void print(){
        System.out.println("Hello I am an AnotherPrinter");
    }
}
