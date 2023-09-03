package lesson03;

public class CarWash implements DoWiping{

    private String name;

    public CarWash(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void wipMirror() {
        System.out.printf("Идет мойка зеркал. На мойке %s. \n", getName());
    }

    @Override
    public void wipWindshields() {
        System.out.printf("Идет мойка лобового окна. На мойке %s. \n", getName());
    }

    @Override
    public void wipHeadlights() {
        System.out.printf("Идет мойка фар. На мойке %s. \n", getName());
    }
}
