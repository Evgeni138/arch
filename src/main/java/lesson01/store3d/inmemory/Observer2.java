package lesson01.store3d.inmemory;

public class Observer2 implements ModelChangedObserver{
    private String name = "observer2";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void applyUpdateModelPolygon() {
        System.out.println("Была добавлена новая полигональная модель - observer$2");
    }

    @Override
    public void applyUpdateModelFlash() {
        System.out.println("Была изменена точка освещения - observer$2");
    }

    @Override
    public void applyUpdateModelCamera() {
        System.out.println("Была добавлена новая камера - observer$2");
    }

    @Override
    public void applyUpdateModelScene() {
        System.out.println("Была добавлена новая сцена - observer$2");
    }
}
