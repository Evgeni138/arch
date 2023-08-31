package lesson01.store3d;

import lesson01.store3d.inmemory.*;
import lesson01.store3d.models.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();
        Observer4 observer4 = new Observer4();



        List<Poligon> poligons = new ArrayList<>();
        Point3D p1Point = new Point3D(7, 7 ,7);
        List<Point3D> pointsP1 = new ArrayList<>();
        Poligon p1 = new Poligon(pointsP1);
        List<PoligonModel> poligonsModels = new ArrayList<>();
        List<Flash> flashes = new ArrayList<>();
        List<Scene> scenes = new ArrayList<>();
        List<Camera> cameras = new ArrayList<>();
        ModelStore store = new ModelStore(poligonsModels, flashes, scenes, cameras);
        store.RegisterModelChanger(observer1);
        store.RegisterModelChanger(observer2);
        store.RegisterModelChanger(observer3);
        store.RegisterModelChanger(observer4);
        poligons.add(p1);
        PoligonModel poligonModel = new PoligonModel(poligons);
        store.addPoligon(poligonModel);

        Point3D pointFlash1Location = new Point3D(0, 0, 0);
        Point3D pointFlash1Angle = new Point3D(1, 1, 1);
        Flash flash1 = new Flash(pointFlash1Location, pointFlash1Angle, "White", 1.2);
        store.addFlash(flash1);
        Point3D pointFlash1Angle2 = new Point3D(2, 2, 2);
        flash1.rotate(pointFlash1Angle2);
        System.out.println(flash1);
        Point3D pointCamera1Location = new Point3D(3, 3, 3);
        Point3D pointCamera1Angle = new Point3D(4, 4, 4);
        Camera camera1 = new Camera(pointCamera1Location, pointCamera1Angle);
        store.addCamera(camera1);
        Scene scene1 = new Scene(poligonsModels, cameras);
        store.addScene(scene1);
        store.getScene(1);
    }
}
