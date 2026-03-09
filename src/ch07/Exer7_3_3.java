package ch07;

import java.util.Arrays;

public class Exer7_3_3 {

	public static void main(String[] args) {
		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println(Arrays.toString(books));
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
	}

}

class Book implements Comparable {
	public Book(int price) {
		this.price = price;
	}

	int price;

	@Override
	public int compareTo(Object o) {
		if (o instanceof Book book) {
			return this.price - book.price;
		}
		return -999999;

	}

	@Override
	public String toString() {
		return "price = " + price;
	}

}