package com.epam.trainig.kd.arraylist;

import java.util.Comparator;

import com.epam.trainig.kd.stationery.Stationery;

public class ByName implements Comparator<Stationery> {
	private String name1;
	private String name2;

	@Override
	public int compare(Stationery o1, Stationery o2) {
		name1 = o1.getClass().getSimpleName();
		name2 = o2.getClass().getSimpleName();
		int k = name1.compareTo(name2);
		return k;
	}

	
}
