package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {
		// 연산에서의 자동 현변환 / <- 정수의 나눗셈 - 몫이라는 정수만 반환
		int v1 = 10;
		int v2 = 3;
		int res1 = v1 / v2;
		System.out.println(res1);

		// 강제 형변환

		double res4 = 10 / (double) 3; // 둘 중에 하나만 double 붙여줘도 자동 형변환 됨
		System.out.println(res4);

		double res5 = 10 / 3; // 정수를 계산 하고 double로 형변환 따로 했기 때문에 3.0 이 됨
		System.out.println(res5);

		// 실수의 나눗셈 -> 소숫점 까지 포함한 결과가 출력
		double res2 = 10.0 / 3.0;
		System.out.println(res2);

		// 실수를 정수로 나누면?
		double res3 = 10.0 / 3;
		System.out.println(res3);

	}

}