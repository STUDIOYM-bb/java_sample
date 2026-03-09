package ch07;

public class Exer7_3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10, 10);
		Triangle t2 = new Triangle(20, 10);

		int res = t1.compareTo(t2);
		System.out.println(res);
		if (res == -999999) {
			System.out.println("삼각형끼리만 비교가 가능합니다.");
		} else if (res > 0) {
			System.out.println(t1 + "이 더 큽니다.");

		} else if (res == 0) {
			System.out.println("두 삼각형의 크기가 같습니다.");
		} else {
			System.out.println(t2 + "가 더 큽니다.");

		}
//		if (res == -999999) {
//			System.out.println("삼각형끼리만 비교가 가능합니다.");
//		} else if (res > 0) {
//			System.out.println(
//					"삼각형 [ width " + t1.width + " , height = " + t1.height + " , 넓이 = " + t1.findArea() + " ] 이 더 큽니다.");
//		} else if (res == 0) {
//			System.out.println("두 삼각형의 크기가 같습니다.");
//		} else {
//			System.out.println(
//					"삼각형 [ width " + t2.width + " , height = " + t2.height + " , 넓이 = " + t2.findArea() + " ] 이 더 큽니다.");
//		}

	}

}

class Triangle implements Comparable {
	// 생성자
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	// 변수
	int height;
	int width;

	@Override
	public int compareTo(Object o) {
		if (o instanceof Triangle triangle) {
			return (int) (this.findArea() - triangle.findArea());
		}
		return -999999;
	}

	double findArea() {
		return (height * width) / (double) 2; // * 1/2 가 안 되는 이유는, int type 이기 때문에 0이 된다.
	}

	@Override
	public String toString() {
		return String.format("삼각형 [width = %d, height = %d, 넓이 = %d]", width, height, (int) this.findArea());
	}

}