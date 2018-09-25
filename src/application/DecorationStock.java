package application;

import domain.Decoration;
import domain.Tree;

import java.util.List;

public class DecorationStock {

    public int getValue(List<Decoration> decorations) {

        int totalValue = 0;
        for (Decoration d : decorations) {
            totalValue += d.price;
        }
        return totalValue;

    }

    public int getStock(List<Decoration> decorations) {

        int totalStock = 0;
        for (Decoration d : decorations) {
            totalStock += 1;
        }
        return totalStock;

    }
}
