package ch05;

public class Exer1 {

	public static void main(String[] args) {
		System.out.println(countChar("hello", 'L')); // ==> 2
		System.out.println(countChar("hello", 'l')); // ==> 2
	}

	static int countChar(String s, char c) {
		// 여기를 완성하고 메서드 호출 결과를 확인하시오
		// 문자열 s에 포함된 문자 c 의 개수를 반환하도록 이 메서드를 구현하시오.
		// 힌트 : String 클래스가 제공하는 charAt() 메서드를 이용하시오.
		// 힌트2 : String 클래스가 제공하는 toLowerCase() 나 toUpperCase() 를 사용하시오.

		int count = 0;

		s = s.toLowerCase();
		c = Character.toLowerCase(c);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}