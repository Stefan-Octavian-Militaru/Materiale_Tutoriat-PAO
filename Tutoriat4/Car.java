public final class Car implements Vehicle {

    FuelType fuelType;

    public Car(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void drive(){
        System.out.println("Im driving a car");
    }

    public void showCharacteristic() {
        System.out.println(fuelType);
    }
}
