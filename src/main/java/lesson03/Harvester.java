package lesson03;

public class Harvester extends Car implements Fueling, Wiping {

    private Refueling refueling;

    private DoWiping carwash;

    public Harvester(String make, String model, String number, Color color) {
        super(make, model, number, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        System.out.printf("Автомобиль номер:%s прибыл на АЗС\n", getNumber());
        this.refueling = refuelingStation;
    }

    public void setCarwash(DoWiping carwash) {
        this.carwash = carwash;
        System.out.printf("Автомобиль номер:%s прибыл на мойку %s\n", getNumber(), carwash.getName());
    }

    @Override
    public void movement() {

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

    public void sweeping() {
        System.out.println("Автомобиль метёт улицу!");
    }



    @Override
    public void wipMirror() {
        System.out.printf("Автомобиль номер:%s ", getNumber());
        if (carwash != null) {
            carwash.wipMirror();
        }
    }

    @Override
    public void wipWindshields() {
        System.out.printf("Автомобиль номер:%s ", getNumber());
        if (carwash != null) {
            carwash.wipWindshields();
        }
    }

    @Override
    public void wipHeadlights() {
        System.out.printf("Автомобиль номер:%s ", getNumber());
        if (carwash != null) {
            carwash.wipHeadlights();
        }
    }

    /**
     * Запрвить автомобиль
     */
    @Override
    public void fuel() {
        System.out.printf("Автомобиль номер:%s ", getNumber());
        if (refueling != null) {
            refueling.fuel(fuelType);
        } else {
            System.out.println("Для заправки необходимо приехать на АЗС.");
        }
    }

    public void leaveStation() {
        System.out.printf("Автомобиль номер:%s покинул станцию.\n", getNumber());
        this.refueling = null;

    }
}
