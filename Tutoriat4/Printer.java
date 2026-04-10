public class Printer implements AdvancedPrinter, AnotherPrinter {

    @Override
    public void print() {
        System.out.println("Hello I am an Printer");
    }
}
