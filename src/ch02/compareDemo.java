package ch02;

public class compareDemo {

	public static void main(String[] args) {

		// 참조타입 비교
		String str1 = "hello"; // 기초타입인것처럼 값으로 취
		String str2 = "hello";
//		String str5 = "hello";

		String str3 = new String("hello"); // 별개로 취급 (객체타입)
		String str4 = new String("hello");
		String str6 = new String("HELLO");

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);

		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str6));

		// 기초타입 비교
		System.out.println(1 == 1);
		System.out.println(true != true);
		System.out.println(3 > 2);
		// System.out.println(true > false);
	}

}
