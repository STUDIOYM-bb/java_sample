package nakseo;

public class Zzzzz {

	public static void main(String[] args) {
		System.out.println(asdf(123));
	}

	static int asdf(int a) {

		int sum = 0;

		while (a > 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum;
	}
}
