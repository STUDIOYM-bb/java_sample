package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer5 { // 배열 연습문제 5

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sel;
		int student = 0;
		int score = 0;

		while (true) {
			ArrayList scores = new ArrayList();

			System.out.println("""
					--------------------------------------------------
					1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
					--------------------------------------------------
					선택 >
					""");
			sel = in.nextLine();
			if (sel.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}
			switch (sel) {
			case "1" -> { // 학생수 입력
				System.out.println("학생수 >");
				student = in.nextInt();
			}
			case "2" -> { // 점수 입력
				for (int i = 0; i < student; i++) {
					System.out.println("0~100 점 까지 점수를 입력해 주세요. scores [" + i + "] >\n");
					score = in.nextInt();
					if (score > 0 && score <= 100) {
						scores.add(score);
					} else {
						System.out.println("잘못된 점수를 입력하셨습니다.");
						break;
					}
				}
			}
			case "3" -> { // 점수리스트
				for (

				}
			}
			}

		}

}

}
