package ch06;

public class Exer6_6 {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		
		System.out.println(c.color);
		c.show();

		Car c1 = new Car("빨강", 180, 900, 4);
		c1.show();
		
		System.out.println();
		Vehicle v = c;
		System.out.println(v.color);
//		System.out.println(v.displacement);
//		System.out.println(v.gears); 부모가 참조할 수 없음
		v.show();
	}

}

class Vehicle {
	// 필드
	String color;
	int speed;

	// 메서드
	void show() {
		System.out.println("색깔 : " + color + "/ 자동차 속도 : " + speed);
	}

	// 생성자
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}

class Car extends Vehicle {
	// 필드
	int displacement;
	int gears;

	// 메서드
	@Override
	void show() {
		System.out.println(
				"색깔 : " + color + "/ 자동차 속도 : " + speed + "/ 자동차 배기량 : " + displacement + "/ 자동차 기어 단수 : " + gears);
	}

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;

	}

}