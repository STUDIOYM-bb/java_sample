package ch02;

public class Hello4 {

	public static void main(String[] args) {
		// 변수 선언과 최과, 사용(참조)하기 전 초기화가 되어 있어야 함 = variable
		// int value1; 스택 메인 안에 4byte 확보 (주소 0x100 ~ 0x103) - 할당 X
		// int value1; 스택 메인 안에 4byte 확보 (주소 0x100 ~ 0x103) - 할당 X
		int firstValue1 = 3;
		firstValue1 = 10; // 이미 자리 잡아놨기 때문에 따로 할당 다시 필요 없음

		System.out.println(firstValue1);

		// 상수 선언과 초기화 (재할당 불가) , 사용 = contant
		final double PI = 3.14; // final 붙이는 순간 이 친구는 상수가 됨 / 재할당 불가
		// PI =3.14000; 이렇게 해도 재할당 안 됨 이미 정해진 상수여서
		System.out.println(PI);
		subFuntion();

	}

	public static void subFuntion() {
		System.out.println("hello");
	}
}
