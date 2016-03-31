package com.epam.trainig.kd.arraylist;

import java.util.Comparator;

import com.epam.trainig.kd.stationery.Stationery;

public class ByPrcByNm implements Comparator<Stationery> {
	
	double k1;
	double k2;
	private String name1;
	private String name2;

	@Override
	public int compare(Stationery o1, Stationery o2) {
		k1 = o1.getPrice();
		k2 = o2.getPrice();
		name1 = o1.getClass().getSimpleName();
		name2 = o2.getClass().getSimpleName();
		
		if (k1 == k2) {
			return name1.compareTo(name2);
		} else if (k1 > k2) {
			return 1;
		} else {
			return -1;
		}
	}

}
