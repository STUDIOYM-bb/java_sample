package ch05;

public class VariableLengthDemo {

	public static void main(String[] args) {
		change(1, "a");
		change(10, "a", "b");
		change(20, "a", "b", "c");
		change(30, "a", "b", "c", "d", "e");
	}

	public static void change(int i, String... s1) { // ... -> 가변개수 인자.
		for (String s : s1) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
