package lesson01.store3d.models;

import java.util.List;

public class PoligonModel {
    private List<Poligon> poligons;
    private List<Texture> textures;

    public List<Poligon> getPoligons() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public PoligonModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }

    public PoligonModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    @Override
    public String toString() {
        return "PoligonModel{" +
                "poligons=" + poligons +
                ", textures=" + textures +
                '}';
    }
}
