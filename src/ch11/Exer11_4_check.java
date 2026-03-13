package ch11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer11_4_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		while (true) {
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();
			if (score >= 0) {
				scoreList.add(score);
			} else {
				System.out.printf("전체 학생은 %d 명이다. \n", scoreList.size());
				System.out.print("학생들의 점수는 : ");
				scoreList.forEach(n -> System.out.print(n + " "));

			}

		}
	}

	public static void printList(ArrayList<Integer> list) {
		for (Integer string : list) {
			System.out.println("학생들의 성적 : " + string);
		}
	}

}
