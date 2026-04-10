public sealed interface Vehicle permits Car, Truck {
    public void drive();
    public void showCharacteristic();
}
