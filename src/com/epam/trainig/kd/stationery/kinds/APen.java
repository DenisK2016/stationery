package com.epam.trainig.kd.stationery.kinds;

import com.epam.trainig.kd.stationery.Stationery;
import com.epam.trainig.kd.stationery.properties.Color;

public class APen extends Stationery implements Color {
	String color;

	public APen(int count, String color, double priceForUnit) {
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
		if (priceOfOne <= 17d) {
			return "mini";
		} else if (priceOfOne <= 25d) {
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
