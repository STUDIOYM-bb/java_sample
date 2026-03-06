package ch07;

public class Exer7_3_1_add {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		int res = c1.compareTo(c2);
		System.out.println(res);
		if (res == -999999) {
			System.out.println("원과 비교할 수 없는 객체입니다.");
		} else if (res > 0) {
			System.out.println("c1이 c2 보다 큽니다.");
		} else if (res == 0) {
			System.out.println("두 원의 크기가 같습니다.");
		} else {
			System.out.println("c1이 c2 보다 작습니다.");

		}
	}

}

class Circle implements Comparable {
	int radius;

	@Override
	public int compareTo(Object o) {
		if (o instanceof Circle circle) {
			return this.radius - circle.radius;
		}
		return -999999;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

}