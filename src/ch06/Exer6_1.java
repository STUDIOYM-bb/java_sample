package ch06;

public class Exer6_1 {

	public static void main(String[] args) {
		Circle1 c = new Circle1(0);
		ColoredCircle c1 = new ColoredCircle(0, null);

		c.show(5);
		c1.show(10, "빨간색");

	}

}

class Circle1 {
	// 필드
	int radius;

	// 생성자
	public Circle1(int radius) {
		this.radius = radius;
	}

	// 메서드
	public void show(int radius) {
		System.out.println("반지름이 " + radius + " 인 원이다.");
	}
}

class ColoredCircle extends Circle1 {
	// 필드
	String color;

	// 생성자
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	// 메서드
	public void show(int radius, String color) {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

}