package ch02;

public class IncrementOpDemo {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;

		x++; // x = 0; x = x + 1; 이 두 개 코드가 합쳐진 꼴
		++y; // y = y + 1; 이 값을 참조

		System.out.println(x);
		System.out.println(y);

		System.out.println(x++);
		System.out.println(++y);

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
