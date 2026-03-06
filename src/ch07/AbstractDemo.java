package ch07;

public class AbstractDemo {

	public static void main(String[] args) {
		Circle1 circle = new Circle1();

		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle1();

		drawShape(circle);
	}

//	static void drawShape(Circle circle) {
//		System.out.println("원을 그립니다.");
//	}
//
//	static void drawShape(Triangle triangle) {
//		System.out.println("삼각형을 그립니다.");
//
//	}
	static void drawShape(Shape shape) {
		System.out.println("도형을 그립니다.");
		// instanceof Circle (써클로 작성된 인스턴스 입니까?
		// 원의 경우 반지름을 설정 한 후 원을 그린다.
		if (shape instanceof Circle1 c) {
			c.setRadius(5);
			c.draw();
		}
	}
}

abstract class Shape {
	// 메서드
	abstract void draw();

	public void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle1 extends Shape {
	// 필드
	private int radius;

	// 접근자, 설정자, toString
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메서드 - 오버라이드
	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}

	@Override
	public void area() {
		System.out.println("원의 넓이");
	}
}

class rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}

}