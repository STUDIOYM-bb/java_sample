package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 소리가 한 시간(60 * 60 초) 동안 가는 거리
		int mach;
		int distance;
		mach = (int) 340.0; // (int) = 명시적 형변환 - double 또는 float 를 int 로 명시적(강제) 형 변환
		distance = mach * 60 * 60;
		System.out.printf("소리가 1시간(60* 60초) 동안 가는 거리는 %d 입니다. \n", distance);

		// 반지름이 10.0인 원의 넓이
		final double PI = 3.14; // 상수 처리
		// int radius 10;
		double radius = 10; // 8 byte - 10.0으로 계산됨 / int가 double 로 자동 형 변환이 됨
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0 인 원의 넓이는 %.2f 입니다. \n", area);

		long l = (long) 3.14d;
		System.out.println(l);
	}

}
