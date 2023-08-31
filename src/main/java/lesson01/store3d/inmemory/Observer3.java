package lesson01.store3d.inmemory;

public class Observer3 implements ModelChangedObserver{
    private String name = "observer3";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void applyUpdateModelPolygon() {
        System.out.println("Была добавлена новая камера - observer$3");
    }

    @Override
    public void applyUpdateModelFlash() {
        System.out.println("Была изменена точка освещения - observer$3");
    }

    @Override
    public void applyUpdateModelCamera() {
        System.out.println("Была добавлена новая камера - observer$3");
    }

    @Override
    public void applyUpdateModelScene() {
        System.out.println("Была добавлена новая сцена - observer$3");
    }
}
