package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String msg = MessageFormat.format("{0}/{1}={2}", 10, 2, 5);
		System.out.println(msg);

		msg = MessageFormat.format("{0}/{1}={2}", new Integer[] { 2, 1, 2 });
		System.out.println(msg);
	}

}
