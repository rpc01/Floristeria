package domain;

public class Decoration {

    public Name getName() {
        return name;
    }

    public Name name;
    public Material material;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int  price;

    public Decoration(Name name, Material color, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }


    @Override
    public String toString() {
        return name.toString();
    }


}