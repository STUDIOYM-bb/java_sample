package ch06;

public class Ball extends Circle2 { // 자식
	@Override
	public void findArea() {
		super.findArea();
		System.out.println("구의 넓이는 " + 4 * (3.14 * radius * radius) + " 입니다.");
	}

}

class Circle2 { // 부모
	int radius;

	private void secret() {
		System.out.println("비밀입니다. ");
	}

	final void finalMethod() {

	}

	static void staticMethod() {

	}

	public void findRadius() {
		System.out.println("반지름은 " + radius + " 입니다.");
	}

	public void findArea() {
		System.out.println("원의 넓이는 " + (3.14 * radius * radius) + " 입니다.");
	}
}