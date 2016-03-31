package com.epam.trainig.kd.stationery.kinds;

import com.epam.trainig.kd.stationery.Stationery;
import com.epam.trainig.kd.stationery.properties.Type;

public class Gum extends Stationery implements Type {

	String type;

	public Gum(int count, String type, double priceForUnit) {
		super.count = count;
		this.type = type;
		super.priceOfOne = priceForUnit;
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	protected String Quality() {
		if (priceOfOne <= 12d) {
			return "mini";
		} else if (priceOfOne <= 15d) {
			return "medium";
		} else {
			return "high";
		}
	}

	@Override
	public String toString() {
		return String.format("[Тип= %s, количество= %dшт, качество= %s, "
				+ "общая цена= %.2f$]", type, count, Quality(), getPrice());
	}

}
