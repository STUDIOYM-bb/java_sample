package ch09;

import java.util.ArrayList;

public class GenericinheritDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();

		list1.add(new Beer());
		list1.add(new Boricha());

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());

		inherit(list1);
//		inherit(list2);

		inherit2(new Beverage());
		inherit2(new Beer());

	}

	static void inherit(ArrayList<Beverage> list) {

	}

	static void inherit2(Beverage b) {

	}
}
