public interface PaymentProcessor {
    public void process(int amount);
    default void log(int amount){
        if (validate(amount)) {
            System.out.println("Processing payment of " + amount + " amount");
        }
        else{
            System.out.println("Payment failed");
        }
    }
    private boolean validate(int amount){
        if (amount <= 0){
            return false;
        }
        return true;
    }
}
