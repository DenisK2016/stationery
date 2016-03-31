package com.epam.trainig.kd.stationery.kinds;

import com.epam.trainig.kd.stationery.*;
import com.epam.trainig.kd.stationery.properties.Size;
import com.epam.trainig.kd.stationery.properties.Thickness;

public class Paper extends Stationery implements Size, Thickness {

	/* Площадь форматов в СМ */
	private final static double A1 = 4995.5;
	private final static double A2 = 2494.8;
	private final static double A3 = 1247.4;
	private final static double A4 = 623.7;
	private String formatPap;
	private double thickness;

	public Paper(int count, String formatPap, double thickness, double priceForUnit) {
		super.count = count;
		super.priceOfOne = priceForUnit;
		this.formatPap = formatPap;
		this.thickness = thickness;
	}

	@Override
	protected String Quality() {
		if (priceOfOne <= 10) {
			return "mini";
		} else if (priceOfOne <= 20) {
			return "medium";
		} else {
			return "high";
		}

	}

	@Override
	public double getThickness() {

		return thickness;
	}

	@Override
	public double getSize() {
		switch (formatPap) {
		case "A1":
			return A1;
		case "A2":
			return A2;
		case "A3":
			return A3;
		case "A4":
			return A4;
		default:
			return -1;
		}

	}

	@Override
	public void setThickness(double thickness) {
		this.thickness = thickness;

	}

	@Override
	public void setSize(String format) {
		formatPap = format;

	}

	@Override
	public String toString() {
		return String.format("[Формат= %s , толщина листа= %.2f"
				+ "мм, количество= %d пачек, качество= %s, общая цена= %.2f $]", 
				formatPap, thickness, count, Quality(), getPrice());
	}
	

}
