package ch12;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MapDemo {

	public static void main(String[] args) {
		String[] sa = { "a", "b", "c", "d", "e" };

		Arrays.stream(sa) // Stream(String)
				.map(String::toUpperCase) // 인스턴스 메서드 참조
				.forEach(Util::print); // static 메서드 참조

		System.out.println();

		Integer[] ia = { 1, 2, 3, 4, 5 };
		Arrays.stream(ia).map(i -> i * 2).forEach(Util::print);

		System.out.println();

		String[] sa1 = { "a1", "b1", "c2", "d3", "e4" };
		// 1. 각 원소의 두 번째 글자만 잘라내서 Stream 으로 반환한다.
		// 2. 그 문자열을 숫자로 변환해서 Stream 으로 반환한다.
		// 3. 숫자 Stream 을 문자열 Stream 으로 반환한다. -> 숫자 앞에 "s"를 붙여서.
		// 4. 출력한다.
		Arrays.stream(sa1).map(s -> s.substring(1)).mapToInt(Integer::parseInt).mapToObj(i -> "s" + i)
				.forEach(Util::print);
		System.out.println();

		// Nation 의 인구만을 값으로 가지는 DoubleStream 으로 변환하기.
		OptionalDouble o = Nation.nations.stream().mapToDouble(n -> n.getPopulation()).max();
		if (o.isPresent())
			System.out.println(o.getAsDouble());
	}
}
