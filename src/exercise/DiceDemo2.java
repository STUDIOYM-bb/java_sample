package exercise;

import java.util.Scanner;

public class DiceDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cycle = 0;
		Dice2 dice2 = new Dice2();

		System.out.println("주사위를 던질 횟수를 입력하세요.");
		cycle = in.nextInt();

		if (cycle < 1) {
			System.out.println("자연수로만 입력해주세요.");
		} else {
			for (int i = 0; i < cycle; i++) {
				dice2.roll();
			}
		}

	}

}

class Dice2 {
	public void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}
}