package lesson03;

public class Program {
    public static void main(String[] args) {

        Harvester harvester1 = new Harvester("Kamaz", "33250", "777", Color.Red);
        Refueling refuelingStation1 = new RefuelingStation();
        harvester1.setRefuelingStation(refuelingStation1);
        SportCar sportCar1 = new SportCar("Ferrari", "Enzo", "888", Color.White);
        harvester1.setFuelType(FuelType.Diesel);
        harvester1.fuel();
        harvester1.leaveStation();
        sportCar1.setRefuelingStation(refuelingStation1);
        sportCar1.setFuelType(FuelType.Gasoline);
        harvester1.fuel();
        sportCar1.fuel();
        CarWash carWash1 = new CarWash("Clearing");
        harvester1.setCarwash(carWash1);
        harvester1.wipMirror();
        harvester1.wipWindshields();
        sportCar1.leaveStation();
        sportCar1.setCarwash(carWash1);
        sportCar1.wipWindshields();
    }

    public static double calculateMaintenance(Car car) {
        if (car.getWheelsCount() == 6) {
            return 1500*6;
        } else {
            return 1000*4;
        }
    }
}
