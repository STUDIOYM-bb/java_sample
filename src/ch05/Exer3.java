package ch05;

import java.util.Scanner;

public class Exer3 {// 배열 연습문제 3

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 반복문
		while (true) {
			// 배열 생성
			String[] arr = new String[5];
			int pos = 0;

			// 입력
			System.out.println("""
					URL 을 입력해주세요. (xxx.yyy.zzz)
					프로그램을 종료하시려면 bye 를 입력해주세요
					""");
			String URL = in.nextLine();
			if (URL.equals("bye")) {
				break;
			} else {
				arr[0] = "";
				for (int i = 0; i < URL.length(); i++) {
					char c = URL.charAt(i);
					if (c == '.') {
						arr[pos + 1] = ".";
						pos = pos + 2;
						arr[pos] = "";
					} else {
						arr[pos] += c;
					}

				}
				System.out.println(URL + " 은 " + arr[4] + " (으)로 끝납니다.");
				System.out.println(URL + " 은 " + arr[2] + " 을(를) 포함합니다.");
				System.out.println(URL + " 은 " + arr[0] + " (으)로 시작합니다.");

			}

		}

	}

}
