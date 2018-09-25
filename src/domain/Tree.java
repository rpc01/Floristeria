package domain;

public class Tree {

   public Name getName() {
      return name;
   }

   public Color getColor() {
      return color;
   }

   public Name name;
   public Color color;

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int  price;

   public Tree(Name name, Color color, int price) {
      this.name = name;
      this.color = color;
      this.price = price;
   }


   @Override
   public String toString() {
      return name.toString();
   }
}