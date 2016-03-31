package com.epam.trainig.kd.arraylist;

import java.util.Comparator;

import com.epam.trainig.kd.stationery.Stationery;

public class ByPrice implements Comparator<Stationery> {
	double k1;
	double k2;

	@Override
	public int compare(Stationery o1, Stationery o2) {
		k1 = o1.getPrice();
		k2 = o2.getPrice();
		if (k1 > k2) {
			return 1;
		} else if (k1 < k2) {
			return -1;
		}
		return 0;

	}

}
