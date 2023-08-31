package lesson01.store3d.inmemory;

public class Observer4 implements ModelChangedObserver{
    private String name = "observer4";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void applyUpdateModelPolygon() {
        System.out.println("Была добавлена новая камера - observer$4");
    }

    @Override
    public void applyUpdateModelFlash() {
        System.out.println("Была изменена точка освещения - observer$4");
    }

    @Override
    public void applyUpdateModelCamera() {
        System.out.println("Была добавлена новая камера - observer$4");
    }

    @Override
    public void applyUpdateModelScene() {
        System.out.println("Была добавлена новая сцена - observer$4");
    }
}
