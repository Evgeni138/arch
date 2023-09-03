package lesson03;

public abstract class Car {
    // region Constructors

    public Car(String make, String model, String number, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.number = number;
    }

    //endregion

    // region Private Fields

    private String make;
    private String model;
    private String number;
    private int wheelsCount;
    private Color color;
    private CarType carType;
    protected FuelType fuelType;
    private GearboxType gearboxType;
    private double engineCapacity;
    private boolean fogLights = false; // Состояние противотуманных фар

    // endregion

    // region Public Methods

    // Движение
    public abstract void movement();

    // Переключение передач
    public abstract void maintenance();

    // Включение фар
    public abstract void switchHeadLights();

    // Включение дворников
    public abstract void switchWipers();

    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    //endregion

    public String getNumber() {
        return number;
    }

}
