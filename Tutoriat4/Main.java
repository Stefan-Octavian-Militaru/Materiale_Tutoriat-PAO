//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        User u = new User(1, "John");
//        User u2 = new User(2,"Jane");
//        Product p = new Product("water", 2);
//        AuditService as = new AuditService();
//        as.auditObject(u);
//        as.auditObject(u2);
//        as.auditObject(p);

//        MyWindow window = new MyWindow();
//        WindowListener listener = window;
//        listener.onOpen();
//        listener.onClose();
//        listener.onResize();

//        CreditCardPayment card = new CreditCardPayment("John Doe", "1234-5678-9101");
//        card.process(10);
//        card.process(1000);
//        card.process(-1);

//        Printer printer = new Printer();
//        printer.print();
        Car car = new Car(FuelType.PETROL);
        Truck truck = new Truck(1000);
        VehicleService vs = new VehicleService();
        vs.describe(truck);
        vs.describe(car);

    }
}