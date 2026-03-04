package exercise;

import java.util.Scanner;

public class DiceDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	}

}

class Dice {
	public void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}
}