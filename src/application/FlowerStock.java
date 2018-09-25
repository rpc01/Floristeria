package application;

import domain.Flower;

import java.util.List;

public class FlowerStock {

	public int getValue(List<Flower> flowers) {

		int totalValue = 0;
		for (Flower f : flowers) {
			totalValue += f.price;
		}
		return totalValue;

	}
	public int getStock(List<Flower> flowers) {

		int totalStock = 0;
		for (Flower f : flowers) {
			totalStock += 1;
		}
		return totalStock;

	}}





