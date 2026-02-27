package ch03;

public class Ex1 {

	public static void main(String[] args) {
		// 변수를 활용한 프로그램의 가독성, 재활용, 유지보수성이 높은 프로그램
		// request - 5 * 6 의 결과를 10 번 출력해달라
		int x = 50, y = 60;
		int totalAmount = x * y;

		// 반복문을 활용한 프로그램의 재활용, 가독성, 유지보수성이 높은 프로그램
//		for(초기식; 조건식; 증감식)) { 반복 실행문(본체); }
		for (int i = 0; i < 10; i++) { // i <= 4 는 i < 5 랑 같음
//			System.out.println((i + 1) + " helloworld"); // k = 1, 2, 3, 4, 5, 6, 7 ... 10
			System.out.printf("%2d helloworld \n", (i + 1));
		}

		// while 문으로 변경

		int i = 0;
		while (i < 10) {
			System.out.printf("%2d helloworld \n", i + 1);
			i++;
		}

		// do while 문으로 변경

		i = 0;
		do {
			System.out.printf("%2d helloworld \n", i + 1);
			i++;
		} while (i < 10);

//		for (;;) { // 무한 루프, 무한 반복문
//			System.out.println(totalAmount);
//		}
//		System.out.println("1 helloworld");
//		System.out.println("2 helloworld");
//		System.out.println("3 helloworld");
//		System.out.println("4 helloworld");
//		System.out.println("5 helloworld");

		// 함수(매서드)를 활용한 프로그램의 재활용
		// 1부터 3까지의 합을 구하는 프로그램

		System.out.println(sum(1, 3));

//		// 4부터 6까지의 합을 구하는 프로그램
//		System.out.println(4 + 5 + 6);

		System.out.println(sum(4, 6));

		// 7부터 9 까지의 합을 구하는 프로그램

		System.out.println(sum(7, 9));

	}// End of main method

	public static int sum(int i1, int i2) {
		int sum = 0;
//		sum += i1;
//		sum += i1 + 1;
//		sum += i2;

		for (int k = i1; k <= i2; k++) {
			sum += k;
		}
		return sum;

	}

}// End of Ex1 Class
