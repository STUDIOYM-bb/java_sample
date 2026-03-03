package ch03;

import java.util.Scanner;

public class BankAnswer {

	public static void main(String[] args) {
		// 요구사항 : 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보시오.
		// 기술적 요구사항 : while 문과 Scanner의 nextLine() 메서드를 이용

		Scanner in = new Scanner(System.in);
		String menu = "";
		int money = 0;

		while (true) {
			System.out.println("""
					------------------------------------
					1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
					------------------------------------
					선택 > """); // 선택메뉴 목록 출력
			menu = in.nextLine();
			if (menu.equals("1")) {
				System.out.println("입금 처리");
			} else if (menu.equals("2")) {
				System.out.println("출금처리");
			} else if (menu.equals("3")) {
				System.out.println("조회처리");
			} else if (menu.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("메뉴 번호 확인 후 다시 입력하세요");
			}

		}

	}

}
