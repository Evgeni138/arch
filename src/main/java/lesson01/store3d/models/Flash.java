package lesson01.store3d.models;

import lesson01.store3d.inmemory.IModelChanger;
import lesson01.store3d.inmemory.ModelChangedObserver;

import java.util.ArrayList;
import java.util.List;

public class Flash {
    // TODO: Доработать в рамках ДР
    private Point3D location;
    private Point3D angle;
    private String color;
    private double power;

    public Point3D getLocation() {
        return location;
    }

    public Point3D getAngle() {
        return angle;
    }

    public String getColor() {
        return color;
    }

    public double getPower() {
        return power;
    }

    public Flash(Point3D location, Point3D angle, String color, double power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Point3D point) {
        this.angle = point;
        System.out.println("Был изменен угол освещения!");
    }

    public void move(Point3D point) {
        this.location = point;
        System.out.println("Точка освещения изменена!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "location=" + location +
                ", angle=" + angle +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

}
