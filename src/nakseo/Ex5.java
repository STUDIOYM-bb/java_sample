package nakseo;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);

		String s = (String) list.get(1);
		System.out.println(s);
	}

}