package lesson01.store3d.inmemory;

import lesson01.store3d.models.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    private List<ModelChangedObserver> observers = new ArrayList<>();
    private List<PoligonModel> poligons = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public ModelStore(List<PoligonModel> poligons, List<Flash> flashes, List<Scene> scenes, List<Camera> cameras) {
        this.poligons = poligons;
        this.flashes = flashes;
        this.scenes = scenes;
        this.cameras = cameras;
    }

    public void addPoligon(PoligonModel model) {
        poligons.add(model);
        notifyChangePolygon();
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
        notifyChangeFlash();
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
        notifyChangeCamera();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        notifyChangeScene();
    }

    public void getScene(int index) {
        for (Scene scene: this.scenes) {
            if (index == scene.getId()) {
                System.out.println(scene);
            } else {
                System.out.println("Под таким номером нет сцены!");
            }
        }
    }

    @Override
    public void notifyChangePolygon() {
        for (ModelChangedObserver observer: observers) {
            if (observer.getName() == "observer1") {
                observer.applyUpdateModelPolygon();
            }
        }
    }

    @Override
    public void notifyChangeFlash() {
        for (ModelChangedObserver observer: observers) {
            if (observer.getName() == "observer2"){
                observer.applyUpdateModelFlash();
            }
        }
    }

    @Override
    public void notifyChangeCamera() {
        for (ModelChangedObserver observer: observers) {
            if (observer.getName() == "observer3"){
                observer.applyUpdateModelCamera();
            }
        }
    }

    @Override
    public void notifyChangeScene() {
        for (ModelChangedObserver observer: observers) {
            if (observer.getName() == "observer4"){
                observer.applyUpdateModelScene();
            }
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
