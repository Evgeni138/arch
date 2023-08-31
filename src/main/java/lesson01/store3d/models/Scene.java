package lesson01.store3d.models;

import java.util.List;

public class Scene {
    // TODO: Доработать в рамках ДР
    private static int counter = 0;
    private int id;
    private List<PoligonModel> poligons;
    private List<Flash> flashes;
    private List<Camera> cameras;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public List<PoligonModel> getPoligons() {
        return poligons;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public Scene(List<PoligonModel> poligons, List<Camera> cameras) {
        this.poligons = poligons;
        this.cameras = cameras;
    }

    public void method1(List<Camera> cameras) {
        int count = 0;
        for (Camera camera: cameras
             ) {
            System.out.printf("Camer: %d готова к использованию!", ++count);
        }
    }

    public void method2(List<Camera> cameras, List<PoligonModel> poligons) {
        System.out.println("Method2 completed!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "id=" + id +
                ", poligons=" + poligons +
                ", flashes='" + flashes + '\'' +
                ", cameras=" + cameras +
                '}';
    }
}
