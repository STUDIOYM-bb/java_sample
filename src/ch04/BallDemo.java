package ch04;

public class BallDemo {

	public static void main(String[] args) {
		Ball ball = new Ball();
		// 공의 반지름을 출력하라.

		System.out.println("공의 반지름은 " + ball.getRadius() + "입니다.");

		// 공의 부피를 알아내어 출력하라.

		System.out.println("공의 부피는 " + ball.getVolume() + "입니다.");

		// 공의 반지름을 반으로 줄이고, 공의 부피를 출력하라.

		ball.setRadius(ball.getRadius() / 2);
		System.out.println("공의 부피는 " + ball.getVolume() + "입니다.");

		ball.setRadius(-5);
		System.out.println("공의 부피는 " + ball.getVolume() + "입니다.");

	}

}
