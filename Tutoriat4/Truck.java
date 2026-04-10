public non-sealed class Truck implements Vehicle{
    int capacity;

    public Truck(int capacity) {
        this.capacity = capacity;
    }
    public void drive(){
        System.out.println("Im driving a truck");
    }
    public void showCharacteristic() {
        System.out.println(capacity);
    }
}
