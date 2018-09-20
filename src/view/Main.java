/*Map<Department, List<Employee>> byDept
        = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));*/


package view;

import application.FlowerStock;
import domain.Flower;
import domain.FlowerColor;
import domain.FlowerName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower(FlowerName.CLAVELL, FlowerColor.GROC, 2));
        flowers.add(new Flower(FlowerName.CLAVELL, FlowerColor.GROC, 2));
        flowers.add(new Flower(FlowerName.ESPIGOL, FlowerColor.LILA,5));
        flowers.add(new Flower(FlowerName.ESPIGOL, FlowerColor.LILA,6));


        for(int i = 0; i<flowers.size();i++) {
        FlowerStock counter = new FlowerStock();
        int totalValue = counter.getValue(flowers);
        int totalStock = counter.getStock(flowers);
        System.out.println("You got " + totalStock + " units of Flowers with a value of " + totalValue);

           // System.out.println(flowers.get(i));

        }
        flowers.forEach(System.out::println);

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
 **/


