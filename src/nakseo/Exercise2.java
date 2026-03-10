package nakseo;

public class Exercise2 {

	public static void main(String[] args) {

		getnum(10);
		getnum(20.2);
		getnum(5.3f);
		getnum("string");
	}

	public static <T extends Number> void getnum(T num) {
		System.out.println(num);
	}
}
