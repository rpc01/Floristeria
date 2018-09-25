package domain;

public class Flower extends Product {
    private Name name;
    private Color color;

    public Flower(Name name, Color color, double price){
        super(price);
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Name getName(){
        return name;
    }

}