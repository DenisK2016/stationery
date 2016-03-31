package com.epam.trainig.kd;

import java.io.*;
import java.util.*;
import com.epam.trainig.kd.stationery.kinds.*;

public class WorkInter {

	private String name;
	private int age;
	private int experience;
	private List<Employee> listEmp = new ArrayList<>();
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public WorkInter() throws Exception {
		while (true) {
			menu();
			int num = Integer.parseInt(reader.readLine());
			if (num == 1) {
				createEmpl();
				continue;
			} else if (num == 2) {
				listEmployee();
				int n = Integer.parseInt(reader.readLine());
				while (true) {
					if (addProd(n).equals("break")) {
						break;
					}
				}
				continue;

			} else if (num == 3) {
				listEmployee();
				int n = Integer.parseInt(reader.readLine());
				System.out.println(listEmp.get(n));
				continue;
			} else if (num == 4) {
				allEmpl();
				continue;
			} else {
				break;
			}

		}
	}

	private void allEmpl() {
		for (Employee e : listEmp) {
			System.out.println(e);
			System.out.println("---------------------");
		}
	}

	private String addProd(int n) throws IOException {
		System.out
				.println(String.format("Выберите канцтовар который хотите добавить:" + " \n%s \n%s \n%s \n%s \n%s \n%s",
						"1 Бумага", "2 Карандаш", "3 Ручка", "4 Стерка", "5 Линейка", "6 Главное меню"));
		int k = Integer.parseInt(reader.readLine());
		if (k == 1) {
			addPaper(n);
			return "";
		} else if (k == 2) {
			addPancil(n);
			return "";
		} else if (k == 3) {
			addPen(n);
			return "";
		} else if (k == 4) {
			addGum(n);
			return "";
		} else if (k == 5) {
			addRuler(n);
			return "";
		} else {
			return "break";
		}
	}

	private void addRuler(int n) throws IOException {
		int count;
		double size;
		double priceForUnit;
		
		System.out.println("Введите через запятую следующие данные");
		System.out.print("количество, шт - ");
		count = Integer.parseInt(reader.readLine());
		System.out.print("\nдлина линейки, см - ");
		size = Double.parseDouble(reader.readLine());
		System.out.print("\nцена за одну штуку, $ - ");
		priceForUnit = Double.parseDouble(reader.readLine());
		listEmp.get(n).addProduct("Линейка", new Ruler(count, size, priceForUnit));
		System.out.println("Товар добавлен для " + listEmp.get(n).getName());
	}

	private void addGum(int n) throws IOException {
		int count;
		String type;
		double priceForUnit;
		
		System.out.println("Введите через запятую следующие данные");
		System.out.print("количество, шт - ");
		count = Integer.parseInt(reader.readLine());
		System.out.print("\nтип стерки(мягкая, твердая) - ");
		type = reader.readLine();
		System.out.print("\nцена за одну штуку, $ - ");
		priceForUnit = Double.parseDouble(reader.readLine());
		listEmp.get(n).addProduct("Стерка", new Gum(count, type, priceForUnit));
		System.out.println("Товар добавлен для " + listEmp.get(n).getName());
	}

	private void addPen(int n) throws IOException {
		int count;
		String color;
		double priceForUnit;
		
		System.out.println("Введите через запятую следующие данные");
		System.out.print("количество, шт - ");
		count = Integer.parseInt(reader.readLine());
		System.out.print("\nцвет ручки - ");
		color = reader.readLine();
		System.out.print("\nцена за одну штуку, $ - ");
		priceForUnit = Double.parseDouble(reader.readLine());
		listEmp.get(n).addProduct("Ручка", new APen(count, color, priceForUnit));
		System.out.println("Товар добавлен для " + listEmp.get(n).getName());
	}

	private void addPancil(int n) throws IOException {
		int count;
		String color;
		double priceForUnit;
		
		System.out.println("Введите через запятую следующие данные");
		System.out.print("количество, шт - ");
		count = Integer.parseInt(reader.readLine());
		System.out.print("\nцвет карандаша - ");
		color = reader.readLine();
		System.out.print("\nцена за одну штуку, $ - ");
		priceForUnit = Double.parseDouble(reader.readLine());
		listEmp.get(n).addProduct("Карандаш", new Pancil(count, color, priceForUnit));
		System.out.println("Товар добавлен для " + listEmp.get(n).getName());
	}

	private void addPaper(int n) throws IOException {
		int count;
		String formatPap;
		double thickness;
		double priceForUnit;
		
		System.out.println("Введите через запятую следующие данные");
		System.out.print("количество пачек, шт - ");
		count = Integer.parseInt(reader.readLine());
		System.out.print("\nформат листов(A1,A2,A3,A4) - ");
		formatPap = reader.readLine();
		System.out.print("\nтолщина листов, мм - ");
		thickness = Double.parseDouble(reader.readLine());
		System.out.print("\nцена за одну пачку, $ - ");
		priceForUnit = Double.parseDouble(reader.readLine());
		listEmp.get(n).addProduct("Бумага", new Paper(count, formatPap, thickness, priceForUnit));
		System.out.println("Товар добавлен для " + listEmp.get(n).getName());
	}

	private void listEmployee() {
		int i = 0;
		
		System.out.println("Выберите сотрудника по номеру: ");
		for (Employee e : listEmp) {
			System.out.println(i++ + " " + e.getName());
		}
	}

	private void createEmpl() throws IOException {
		System.out.println("Введите имя сотрудника: ");
		name = reader.readLine();
		System.out.println("Введите возраст сотрудника: ");
		age = Integer.parseInt(reader.readLine());
		System.out.println("Введите стаж работы сотрудника: ");
		experience = Integer.parseInt(reader.readLine());
		listEmp.add(new Employee(name, age, experience));
		System.out.println("Сотрудник создан!");
	}

	private void menu() {
		System.out.println("");
		System.out.println(String.format("%S", "Учет концелярских товаров сотрудника."));
		System.out.println("Вводите: ");
		System.out.println("1 для создания сотрудника.");
		System.out.println("2 для добавления концтоваров сотруднику.");
		System.out.println("3 для просмотра информации о сотруднике.");
		System.out.println("4 для просмотра информации о всех сотрудниках.");
		System.out.println("5 Выход.");
	}

}
