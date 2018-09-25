package application;

import domain.Decoration;
import domain.Flower;
import domain.Name;
import domain.Tree;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stock {

    public static void stock(List<Flower> flowers, List<Tree> trees, List<Decoration> decorations) {
        //Stock
        Map<Name, Long> totalByName
                = flowers.stream()
                .collect(Collectors.groupingBy(Flower::getName,
                        Collectors.counting()));
        System.out.println("Stock of Flowers:");
        totalByName.forEach((name, count) -> {
            System.out.println(name + " " + count);});

        totalByName = trees.stream()
                .collect(Collectors.groupingBy(Tree::getName,
                        Collectors.counting()));
        System.out.println("Stock of Trees:");
        totalByName.forEach((name, count) -> {
            System.out.println(name + " " + count);});

        totalByName = decorations.stream()
                .collect(Collectors.groupingBy(Decoration::getName,
                        Collectors.counting()));
        System.out.println("Stock of Decorations:");
        totalByName.forEach((name, count) -> {
            System.out.println(name + " " + count);});
    }
}

