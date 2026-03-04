package exercise;

public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();

		// Math.random() 값 확인, = 0~1 사이의 실수 값,
		// 1부터 10 사이의 정수로 반환하도록?
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int) (Math.random() * 10) + 1);

		// 0, 1 만 출력하도록?
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int) (Math.random() * 2));
//
//		}

		dice.roll(); // 결과 : 1부터 6 사이의 값이 랜덤하게 출력
	}
}

class Dice {
	public void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}
}