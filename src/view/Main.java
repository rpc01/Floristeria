/*Map<Department, List<Employee>> byDept
        = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));*/


package view;

import application.Stock;
import domain.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //afegirFloristeria
        List<Florist> florists = new ArrayList<>();
        florists.add(new Florist("BestFlorist"));
        florists.add(new Florist("WorstFlorist"));


        //afegirFlor
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower(Name.CLAVELL, Color.GROC, 21.1));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,5));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,6));
        flowers.add(new Flower(Name.CLAVELL, Color.GROC, 5));
        flowers.add(new Flower(Name.CLAVELL, Color.GROC, 2));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,5));
        flowers.add(new Flower(Name.ESPIGOL, Color.LILA,6));

        //afegirArbre
        List<Tree> trees = new ArrayList<>();
        trees.add(new Tree(Name.PI, 2.2, 20));
        trees.add(new Tree(Name.ALZINA, 5, 200));

        //afegirDecoració
        List<Decoration> decorations = new ArrayList<>();
        decorations.add(new Decoration(Name.PINYA, Material.FUSTA, 2.2));
        decorations.add(new Decoration(Name.BOLA, Material.PLASTIC, 1.2));

        //treureStock
        Stock.stock(flowers, trees, decorations);

    }

}








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


