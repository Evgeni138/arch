package lesson01.store3d.inmemory;

public interface ModelChangedObserver {

    String getName();
    void applyUpdateModelPolygon();
    void applyUpdateModelFlash();

    void applyUpdateModelCamera();

    void applyUpdateModelScene();

}
