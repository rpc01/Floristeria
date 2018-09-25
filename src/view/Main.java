/*Map<Department, List<Employee>> byDept
        = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));*/


package view;

import application.DecorationStock;
import application.FlowerStock;
import application.TreeStock;
import domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //afegirFlor
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower(Name.CLAVELL, Color.GROC, 2));
        flowers.add(new Flower(Name.CLAVELL, Color.GROC, 2));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,5));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,6));

        //afegirArbre
        List<Tree> trees = new ArrayList<>();
        trees.add(new Tree(Name.PI, Color.VERD, 20));
        trees.add(new Tree(Name.ALZINA, Color.GROC, 200));

        //afegirDecoració
        List<Decoration> decorations = new ArrayList<>();
        decorations.add(new Decoration(Name.PINYA, Material.FUSTA, 2));
        decorations.add(new Decoration(Name.BOLA, Material.PLASTIC, 1));


        //Treure Stock
        int totalStock = 0;
        int totalValue = 0;
        for(int i = 0; i<flowers.size();i++) {
        FlowerStock counter = new FlowerStock();
        totalValue = counter.getValue(flowers);
        totalStock = counter.getStock(flowers);
        }
        System.out.println("STOCK");
        System.out.println("FLORS:");
        flowers.forEach(System.out::println);
        System.out.println();
        System.out.println("You got " + totalStock + " units of Flowers with a value of " + totalValue);
        System.out.println();

        int total = flowers.stream()
                .collect(Collectors.summingInt(Flower::getPrice));

        System.out.println(total);

        Map<Color, Integer> totalByColor
                = flowers.stream()
                .collect(Collectors.groupingBy(Flower::getColor,
                        Collectors.summingInt(Flower::getPrice)));
        System.out.println(totalByColor);

        Map<Name, List<Flower>> byName
                = flowers.stream()
                .collect(Collectors.groupingBy(Flower::getName));
        System.out.println(byName);

        List<Name> list = flowers.stream().map(Flower::getName).collect(Collectors.toList());
        System.out.println(list);


       /* //Trees

        for(int i = 0; i<trees.size();i++) {
            TreeStock counter = new TreeStock();
            totalValue = counter.getValue(trees);
            totalStock = counter.getStock(trees);
        }
        System.out.println("ARBRES:");
        trees.forEach(System.out::println);
        System.out.println();
        System.out.println("You got " + totalStock + " units of Trees with a value of " + totalValue);
        System.out.println();

        //Decoration
        System.out.println("DECORACIO:");
        for(int i = 0; i<trees.size();i++) {
            DecorationStock counter = new DecorationStock();
            totalValue = counter.getValue(decorations);
            totalStock = counter.getStock(decorations);
        }

        decorations.forEach(System.out::println);
        System.out.println();
        System.out.println("You got " + totalStock + " units of decoration items with a value of " + totalValue);
        System.out.println();
*/


}}









/**
 crearFloristeria

 afegirArbre

 afegirFlor

 afegirDecoracio

 stock: tots els arbre, flors i decoració que té la floristeria

 EXEMPLE STOCK:
 ARBRES:
 TTTTTTT
 FLORS:
 YYYYYY
 DECORACIÓ:
 XXXXXXXX


 Map<Integer, List<Flower>> byPrice = flowers.stream().collect(
 Collectors.groupingBy(Flower::getPrice));

 byPrice.forEach((k, v) -> System.out.println("DeptId:"
 + k
 + "  "
 + ((List<Flower>) v).stream().map(m -> m.getPrice())
 .collect(Collectors.joining(""))));

 int total = flowers.stream().collect(
 Collectors.summingInt(Flower::getPrice));
 System.out.println("Total Employees Salary : " + total);





 **/


