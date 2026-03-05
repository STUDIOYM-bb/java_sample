package ch05;

public class BallArrayDemo {

	public static void main(String[] args) {
		Ball[] balls = new Ball[5]; // 크기 5짜리 배열 생성 (공 5개 담을거임)
		balls[0] = new Ball(5); // 0번 자리에 5 짜리 공 생성
		balls[1] = new Ball(10);

		for (Ball ball : balls) { // ⭐️⭐️⭐️⭐️⭐️
//			ball.info();
			// Object 의 toString() ==> getClass().getName() + "@" +
			// Integer.toHexString(hashCode());
			System.out.println(ball);
		}
	}

}

class Ball {
	// 변수
	int radius;

	// 생성자
	public Ball(int radius) {
		this.radius = radius;
	}

	// 메서드
	public void info() {
		System.out.println("크기가 " + radius + "인 공입니다.");
	}
	// 모든 객체의 조상은 object , 부모로부터 물려받은 toString (ch05.Ball@50040f0c) 을 오버라이딩 해보자.

	@Override
	public String toString() {
		return String.format("Ball [radius = %d]", radius);
	}

}