package ch05;

import java.util.Arrays;

public class Exer4 {

	public static void main(String[] args) {
		// 힌트 : Math.random() 이 제공하는 값을 활용
		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		int index;
		for (int i = 0; i < 10; i++) {
			index = ((int) (Math.random() * 3));
			// System.out.println(index);
			System.out.println(name[index]);

		}

	}

}
