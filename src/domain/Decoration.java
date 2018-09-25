package domain;

public class Decoration extends Product {
    //public enum Material {PLASTIC, WOOD;}
    private Material material;
    private Name name;

    public Decoration(Name name, Material material, double price){
        super(price);
        this.material = material;
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public Name getName() {
        return name;
    }



}