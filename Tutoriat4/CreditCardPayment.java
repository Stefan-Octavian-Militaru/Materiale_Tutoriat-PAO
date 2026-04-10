public class CreditCardPayment implements PaymentProcessor {
    String cardHolder;
    String cardNumber;


    public CreditCardPayment(String cardHolder, String cardNumber) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public void process(int amount){
        log(amount);
        System.out.println("Payment processed: " + cardHolder + " " + cardNumber);
    }
}
