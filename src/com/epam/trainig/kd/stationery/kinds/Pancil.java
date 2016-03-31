package com.epam.trainig.kd.stationery.kinds;

import com.epam.trainig.kd.stationery.Stationery;
import com.epam.trainig.kd.stationery.properties.Color;

public class Pancil extends Stationery implements Color {

	String color;

	public Pancil(int count, String color, double priceForUnit) {
		super.count = count;
		this.color = color;
		super.priceOfOne = priceForUnit;
	}

	@Override
	public void setColor(String color) {
		this.color = color;

	}

	@Override
	public String getColor() {

		return color;
	}

	@Override
	protected String Quality() {
		if (priceOfOne <= 7d) {
			return "mini";
		} else if (priceOfOne <= 10d) {
			return "medium";
		} else {
			return "high";
		}
	}

	@Override
	public String toString() {
		return String.format("[Цвет= %s, количество= %dшт, качество= %s, " + "общая цена= %.2f$]", color, count,
				Quality(), getPrice());
	}

}
