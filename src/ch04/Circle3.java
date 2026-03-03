package ch04;

public class Circle3 {
	// 생성자 오버로딩
	public Circle3() {
		this("red", 1.0);
	}

	public Circle3(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	public Circle3(String color) {
//		this.color = "blue"; 생성자를 코드로 불러서 쓸 때는 반드시 맨 첫 줄에 써야한다.(생성자와 다른 코드를 함께 쓸 때)
		this(color, 1.0);
		this.color = "blue";
//		this.color = color;
//		this.radius = 1.0;
	}

	public Circle3(double radius) {
		this("red", radius);
//		this.color = "red";
//		this.radius = radius;

	}

	String color;
	double radius;

	void printInfo() {
		System.out.printf("원의 색깔은 %s , 반지름은 %.1f \n", color, radius);

	}

}
