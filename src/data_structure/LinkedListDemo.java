package data_structure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		System.out.println(list.size());

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		System.out.println(list);

		System.out.println(list.get(0));

		System.out.println();

		list.remove();
	}

}
