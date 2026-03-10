package nakseo;

public class Exercise {

	public static void main(String[] args) {
		print("안녕", 3);
		print(3, 2.1);
		print(3.14, "최고");
	}

	static <T, V> void print(T s, V t) {
		System.out.println(s + ":" + t);
	}

}
