package com.epam.trainig.kd.stationery.kinds;

import com.epam.trainig.kd.stationery.Stationery;
import com.epam.trainig.kd.stationery.properties.Size;

public class Ruler extends Stationery implements Size {
	private double size;

	public Ruler(int count, double size, double priceOfOne) {
		super.count = count;
		super.priceOfOne = priceOfOne;
		this.size = size;
	}

	@Override
	public double getSize() {
		return size;
	}

	@Override
	public void setSize(String size) {
		try{
			this.size = Double.parseDouble(size);
		}catch(NumberFormatException e){
			System.out.println("Не правильный размер!");
		}

	}

	@Override
	protected String Quality() {
		if (priceOfOne <= 15d) {
			return "mini";
		} else if (priceOfOne <= 20d) {
			return "medium";
		} else {
			return "high";
		}
	}

	@Override
	public String toString() {
		return String.format("[Размер линейки= %.2fсм, количество= %dшт, "
				+ "качество= %s, общая цена= %.2f$]", 
				size, count, Quality(), getPrice());
	}
	

}
