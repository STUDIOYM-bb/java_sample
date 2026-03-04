package ch05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println(al);

		al.remove(1);
		System.out.println(al);

	}

}
