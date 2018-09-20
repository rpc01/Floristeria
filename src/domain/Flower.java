package domain;

public class Flower {

    public FlowerName getName() {
        return name;
    }

    public FlowerColor getColor() {
        return color;
    }

    public FlowerName name;
    public FlowerColor color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int  price;

    public Flower(FlowerName name, FlowerColor color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    @Override
    public String toString() {
        return name.toString();
    }


}