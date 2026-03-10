package ch08;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c.AM);
		System.out.println(c.DAY_OF_WEEK);
		System.out.println(c.YEAR);
		System.out.println(c.MONTH);

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));

	}

}
