package nakseo;

import java.util.Scanner;

public class ThisIsJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sel = "";
		int money = 0;
		int balance = 0;
		while (true) {
			System.out.println("""
					---------------------------------
					1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
					---------------------------------
					선택 >
					""");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.println("예금액 > ");

				try {
					money = Integer.parseInt(sc.nextLine());
					if (money > 0) {
						balance = balance + money;
					} else {
						System.out.println("잘못된 금액입니다.");
					}
				}

				catch (NumberFormatException e) {
					System.out.println("숫자만 입력해주세요.");
				}
				break;

			case "2":
				System.out.println("출금액 > ");

				try {
					money = Integer.parseInt(sc.nextLine());
					if (money > 0) {
						if (balance >= money) {
							balance = balance - money;
						} else {
							System.out.println("잔액이 부족합니다.");
						}
					} else {
						System.out.println("잘못된 금액입니다.");
					}

				} catch (NumberFormatException e) {
					System.out.println("숫자만 입력해주세요.");
				}

				break;
			case "3":
				System.out.println("잔고 > " + balance);
				break;
			case "4":
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}

		}
	}
}