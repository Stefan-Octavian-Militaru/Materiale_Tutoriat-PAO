public interface AdvancedPrinter {

    default void print(){
        System.out.println("Hello I am an AdvancedPrinter");
    }
}
