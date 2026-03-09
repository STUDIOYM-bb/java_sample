package ch07;

public class Exer7_3_1 {// ⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️
	public static void main(String[] args) {
		Line line1 = new Line(9);
		Line line2 = new Line(13);
		Line line3 = null;
		Circle circle = new Circle(3);

//		int res = line2.compareTo(line3); // NullPointerException
		int res = line1.compareTo(line2); // ClassCastException
		System.out.println(res);
		if (res == -999999) {
			System.out.println("선과 비교할 수 없는 객체입니다.");
		} else if (res > 0) {
			System.out.println("line1 이 더 깁니다.");
		} else if (res == 0) {
			System.out.println("두 선의 길이가 같습니다.");
		} else {
			System.out.println("Line2 가 더 깁니다.");
		}
	}
}

class Line implements Comparable {
	int length;

	@Override
	public int compareTo(Object o) {
//		Line line = (Line) o;
//		this.length - o.length;
		if (o instanceof Line line) {
			return this.length - line.length;
		}
		return -999999;
	}

	public Line(int length) {
		this.length = length;
	}
}
