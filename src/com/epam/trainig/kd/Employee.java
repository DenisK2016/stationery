package com.epam.trainig.kd;

import java.util.*;
import com.epam.trainig.kd.stationery.*;

public class Employee {

	private String name;
	private int age;
	private int experience;
	private double totalPrice;
	private Map<String, Stationery> listProduct = new HashMap<>();

	public Employee(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}

	public void addProduct(String nameProduct, Stationery product) {
		if (listProduct.containsKey('\n' + nameProduct)) {
			int i = 0;
			while (true) {
				String nameProd = '\n' + nameProduct + ++i;
				if (listProduct.containsKey(nameProd)) {
					continue;
				}
				listProduct.put(nameProd, product);
				break;
			}
		} else {
			listProduct.put('\n' + nameProduct, product);
		}

	}

	public void removeProduct(String nameProduct) {
		listProduct.remove(nameProduct);
	}

	public String getName() {
		return name;
	}

	public String totalPrice() {
		for (Map.Entry<String, Stationery> prod : listProduct.entrySet()) {
			totalPrice += prod.getValue().getPrice();
		}
		return totalPrice + "$";
	}

	@Override
	public String toString() {
		return String.format(
				"Сотрудник [Имя= %s, возраст= %dлет, стаж работы= %dлет, "
						+ "стоимость всех его канцтоваров= %s] \nСписок концтоваров:%s",
				name, age, experience, totalPrice(), listProduct);
	}

}
