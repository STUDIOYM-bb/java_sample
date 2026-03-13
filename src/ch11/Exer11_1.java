package ch11;

import java.util.ArrayList;

public class Exer11_1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("갈매기");
		arr.add("나비");
		arr.add("다람쥐");
		arr.add("라마");

		for (String string : arr) {
			if (string.length() == 2) {
				System.out.println(string);
			}
		}

		arr.stream().filter(s -> s.length() == 2).forEach(System.out::println);
	}

}
