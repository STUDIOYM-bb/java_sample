package nakseo;

import java.util.Scanner;

public class ThisIsJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");
		int x = sc.nextInt();
		int y = 0;
		int count = 0;
		for (int i = 2; i <= x; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					y++;
				}
			}
			if (y == 0) {
				count++;
			}
			y = 0;

		}
		System.out.printf("1 부터 %d 까지 %d 개의 소수가 있습니다.", x, count);
	}
}