package ch03;

import java.util.Scanner;

public class BankQuestion1 {

	public static void main(String[] args) {
		Scanner sel = new Scanner(System.in); // 입력 전체 설

		int bal = 0; // 잔고 변수명 설정 및 값 초기화 (루프 내에서는 초기화 X)
		int in = 0; // 입금액 변수명 설정 및 값 초기화 (루프 내에서는 초기화 X)
		int out = 0; // 출금액 변수명 설정 및 값 초기화 (루프 내에서는 초기화 X)
		int selMenu = 0; // 메뉴선택 변수명 설정 및 값 초기화 (루프 내에서는 초기화 X)

		while (true) {
			System.out.println("""
					------------------------------------
					1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
					------------------------------------
					선택 > """); // 선택메뉴 목록 출력
			selMenu = sel.nextInt(); // 최초 선택메뉴 입력
			if (selMenu < 1 || selMenu > 4) {
				System.out.println("화면에 표시된 번호 내에서 다시 선택해 주세요."); // 선택지 이외

			} else if (selMenu == 4) { // 종료 코드
				System.out.println("프로그램 종료");
				break; // 시스템 종료
			} else if (selMenu == 1) { // 입금 코드
				System.out.println("입금액 > ");
				in = sel.nextInt(); // 입력 된 입금액 in 변수에 추가
				bal = bal + in; // 잔고 변수에 입금액 합산
				System.out.printf("현재 잔고 %d 원", bal); // 잔고 확인

			} else if (selMenu == 2) { // 출금 코드
				System.out.println("출금액 > ");
				out = sel.nextInt();// 입력 된 출금액 out 변수에 추가
				if (bal < out) // 잔액이 부족할 때
					System.out.println("잔액이 부족합니다. 잔액을 확인 후 처음부터 다시 시도해주세요.");
				else // 잔액이 충분할 때
					bal = bal - out; // 잔고 변수에 출금액 차감
				System.out.printf("현재 잔고 %d 원", bal); // 잔고 확인

			} else if (selMenu == 3) { // 잔액 확인 코드
				System.out.printf("현재 잔고 %d 원", bal); // 잔고 확인

			}

		}

	}

}
