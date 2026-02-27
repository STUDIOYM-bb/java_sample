package ch03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 구구단 프로그램 제작 과제
		// 요구사항 - 사용자로부터 구구단 몇 단을 출력할 것인지를 입력받아서 해당 단의 구구단을 출력하라
		// 2~9까지만 가능, 그 이외의 숫자는 출력할 수 없다고 출력
		// 수정 요구사항 - 여러 번 입력받아서 입력받은 단을 출력한다. -1을 입력하면 구구단 출력을 멈춘다
		// 기술적 요구사항 - while 문을 이용해서 작성해주세요.
		Scanner in = new Scanner(System.in);
		int dan = 0;
//		while (true) {
//			System.out.print("몇 단을 출력할 것인지 입력해주세요 ( 2 ~ 9 단 까지). 종료하려면 -1 을 입력하세요. : ");
//
//			dan = in.nextInt();
//
//			if (dan == -1)
//				break;
//
//			if (dan < 2 || dan > 9) {
//				System.out.println("2 단 부터 9 단 까지만 출력 할 수 있습니다.");
//			} else {
//				for (int i = 1; i < 10; i++) {
//					System.out.printf("%d X %d = %d \n", dan, i, (dan * i));
//				}
//
//			}
//
//		}
//		System.out.println("프로그램을 종료합니다.");

		do {
			System.out.print("몇 단을 출력할 것인지 입력해주세요 ( 2 ~ 9 단 까지). 종료하려면 -1 을 입력하세요. : ");

			dan = in.nextInt();

			if (dan == -1)
				break;

			if (dan < 2 || dan > 9) {
				System.out.println("2 단 부터 9 단 까지만 출력 할 수 있습니다.");
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d X %d = %d \n", dan, i, (dan * i));
				}

			}

		} while (dan != -1);

		System.out.println("프로그램을 종료합니다.");

	}

}
