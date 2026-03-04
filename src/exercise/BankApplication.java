package exercise;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Account[] account = new Account[100];

		String acN = "";
		String acA = "";
		int amount = 0;
		int count = 0;

		String template = ("""
				-----------------------------------------------
				1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-----------------------------------------------
				선택 >
				""");
		String menu = "";
		int money;
		while (true) {
			System.out.println(template);
			menu = in.nextLine();
			if (menu.equals("5"))
				break;
			switch (menu) {
			case "1" -> { // 계좌 개설
				System.out.println("계좌 생성 처리 중...\n");
				System.out.println("계좌 번호를 입력해주세요. -> ");
				acN = in.nextLine();
				System.out.println("계좌주 명을 입력해주세요. -> ");
				acA = in.nextLine();
				System.out.println("입금액을 입력해주세요. -> ");
				amount = Integer.parseInt(in.nextLine());

				Account account1 = new Account(acN, acA, amount);

				account[count] = account1;
				count++;
			}
			case "2" -> { // 계좌 목록 조회
				System.out.println("계좌 목록 조회 중...\n");
				for (int i = 0; i < count; i++) {
					System.out.println("계좌번호 : " + account[i].getAccountNo() + "\n계좌주 : " + account[i].getAccountOwner()
							+ "\n잔액 " + account[i].getBalance() + "\n----------------");
				}
			}
			case "3" -> { // 예금
				System.out.println("예금 처리중... \n");
				System.out.println("계좌번호를 입력해주세요. \n");
				acN = in.nextLine();
				int i;
				for (i = 0; i < count; i++) {
					if (account[i].getAccountNo().equals(acN)) {
						System.out.println("예금액을 입력해주세요.");
						amount = Integer.parseInt(in.nextLine());
						account[i].deposit(amount);
						break;
					}

				}
				if (i == count) {
					System.out.println("계좌번호를 확인해주세요.");
				}

			}
			case "4" -> { // 출금
				System.out.println("출금 처리중... \n");
				System.out.println("계좌번호를 입력해주세요. \n");
				acN = in.nextLine();
				int i;
				for (i = 0; i < count; i++) {
					if (account[i].getAccountNo().equals(acN)) {
						System.out.println("출금액을 입력해주세요.");
						amount = Integer.parseInt(in.nextLine());
						account[i].withdraw(amount);
						break;
					}
				}
				if (i == count) {
					System.out.println("계좌번호를 확인해주세요.");
				}
			}
			default -> System.out.println("메뉴 확인 바랍니다.");
			}
		}
		System.out.println("프로그램 종료");

	}

}

class Account {
	// 비즈니스 도메인의 비즈니스 로직, 룰 정의되어 있어야 함.
	// 생성자
	public Account(String accountNo, String accountOwner, int balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	// 필드
	private String accountNo; // 계좌번호
	private String accountOwner; // 계좌주
	private int balance; // 예금액

	// 접근자(모든 변수에 대해서 열어놓고), 설정자(비즈니스 도메인의 로직에 맞게 조정)
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public int getBalance() {
		return balance;
	}

	// 메서드 (입금, 출금, 조회)
	public void deposit(int money) {
		// overflow 고려해서 refactoring 할것 ==> 검증 필
		long total = balance + money;
		if (total < 2_000_000_000) {
			balance = balance + money;
		} else {
			System.out.println("계좌 한도를 초과하였습니다.");
		}
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance = balance - money;
			System.out.println("결과 : 출금이 성공되었습니다.");
		} else {
			System.out.println("계좌 잔액이 부족합니다.");
		}
	}

	public int inquiry() {
		return balance;
	}

}