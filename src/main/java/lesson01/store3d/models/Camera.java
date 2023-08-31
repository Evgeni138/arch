package lesson01.store3d.models;

import lesson01.store3d.inmemory.ModelChangedObserver;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    // TODO: Доработать в рамках ДР
    private Point3D location;
    private Point3D angle;

    public Point3D getLocation() {
        return location;
    }

    public Point3D getAngle() {
        return angle;
    }

    public Camera(Point3D location, Point3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Point3D point) {
        this.angle = point;
        System.out.println("Был изменен угол поворота камеры!");
    }

    public void move(Point3D point) {
        this.location = point;
        System.out.println("Точка установки камеры изменена!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "location=" + location +
                ", angle=" + angle +
                '}';
    }

}
