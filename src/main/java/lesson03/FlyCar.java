package lesson03;

public class FlyCar extends Car {
    public FlyCar(String make, String model, String number, Color color) {
        super(make, model, number, color);
        setWheelsCount(4);
    }

    public void fly() {
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public void switchHeadLights() {

    }

    @Override
    public void switchWipers() {

    }
}
