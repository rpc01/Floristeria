package application;

import domain.Tree;

import java.util.List;

public class TreeStock {

    public int getValue(List<Tree> trees) {

        int totalValue = 0;
        for (Tree t : trees) {
            totalValue += t.price;
        }
        return totalValue;

    }

    public int getStock(List<Tree> trees) {

        int totalStock = 0;
        for (Tree f : trees) {
            totalStock += 1;
        }
        return totalStock;

    }
}
