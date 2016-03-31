package com.epam.trainig.kd.arraylist;

import java.util.*;

import com.epam.trainig.kd.stationery.Stationery;
import com.epam.trainig.kd.stationery.kinds.APen;
import com.epam.trainig.kd.stationery.kinds.Gum;
import com.epam.trainig.kd.stationery.kinds.Pancil;
import com.epam.trainig.kd.stationery.kinds.Paper;
import com.epam.trainig.kd.stationery.kinds.Ruler;

public class Main {

	public static void main(String[] args) {
		List<Stationery> listByName = new ArrayList<>();
		List<Stationery> listByPrice = new ArrayList<>();
		List<Stationery> listByPrcByNm = new ArrayList<>();
		Stationery sttn = new APen(3, "Red", 30);
		Stationery sttn1 = new APen(4, "Yellow", 40);
		Stationery sttn2 = new Gum(5, "M", 10);
		Stationery sttn3 = new Gum(3, "N", 25);
		Stationery sttn4 = new Pancil(2, "Black", 12);
		Stationery sttn5 = new Paper(3, "A4", 0.2, 25);
		Stationery sttn6 = new Ruler(2, 25, 4);

		listByName.add(sttn);
		listByName.add(sttn1);
		listByName.add(sttn2);
		listByName.add(sttn3);
		listByName.add(sttn4);
		listByName.add(sttn5);
		listByName.add(sttn6);
		listByPrice.addAll(listByName);
		listByPrcByNm.addAll(listByName);

		Collections.sort(listByName, new ByName());
		Collections.sort(listByPrice, new ByPrice());
		Collections.sort(listByPrcByNm, new ByPrcByNm());

		for (Stationery s : listByName) {
			System.out.println(s.getClass().getSimpleName() + " " + s);
		}
		System.out.println("-----------");
		for (Stationery s : listByPrice) {
			System.out.println(s.getClass().getSimpleName() + " " + s);
		}
		System.out.println("-----------");
		for (Stationery s : listByPrcByNm) {
			System.out.println(s.getClass().getSimpleName() + " " + s);
		}

	}

}
