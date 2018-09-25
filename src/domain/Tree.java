package domain;

public class Tree extends Product {
   private Name name;
   private double heigth;

   public Tree(Name name, double heigth, double price){
      super(price);
      this.name = name;
      this.heigth = heigth;
   }

   public double getHeigth() {
      return heigth;
   }

   public Name getName(){
      return name;
   }

}