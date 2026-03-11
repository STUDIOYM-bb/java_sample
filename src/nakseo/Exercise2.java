package nakseo;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");
		int x = sc.nextInt();
		int y = 0;
		int count = 0;
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				y++;
			}
		}
		if (y == 0) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
