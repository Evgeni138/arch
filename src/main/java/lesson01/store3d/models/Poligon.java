package lesson01.store3d.models;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon() {
    }

    @Override
    public String toString() {
        return "Poligon{" +
                "points=" + points +
                '}';
    }
}
