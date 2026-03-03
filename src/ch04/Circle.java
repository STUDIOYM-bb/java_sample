package ch04;

public class Circle {
	// 추가적 요구사항 - 반지름이 10으로 생성되도록 생성자를 추가할것. - ver.1.0
	// ver.2.0 추가 요구사항 - 내가 생성하고 싶은 반지름을 매개변수로 전달하면, 그 값을 이용해서 반지름을 생성해줘.

	// 생성자 - 명시적 새성자가 없는 경우에만 컴파일러가 자동으로 기본 생성자를 만듦 - 생성자 오버로딩
	public Circle() {
		radius = 10.0; // ver.1.0
	}

	public Circle(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 10.0; // ver.1.0
		}
	}

	// 필드
	private double radius; // 캡슐화, 은닉, 인스턴스 변수
	final double PI = 3.14;

	// getter(필수), setter(필요시) 참조, 설정 메서드
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) { // radius = 매개변수, 지역변수
		if (radius > 0) {
			this.radius = radius; // this = 객체

		}

	}

	// 메서드
	double getArea() { // 넓이를 구하는 공식
		return PI * radius * radius;
	}

}
