package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceDemo { // 코드 확인!

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();

		// ArrayList 에 10만건 데이터 추가 / 1) 맨 뒤에 항목 추가 2) 맨 앞에 항목 추가
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al.add(0, i);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList 로 처리한 시간 : " + (end - start));

		long start2 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al.remove(0);
		}
		long end2 = System.nanoTime();

		System.out.println("ArrayList 로 처리한 시간 : " + (end2 - start2));

		// LinkedList 에 10만건 데이터 추가 / 1) 맨 뒤에 항목 추가 2) 맨 앞에 항목 추가
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ll.add(i);
			ll.addFirst(i);
		}
		end = System.nanoTime();

		System.out.println("LinkedList 로 처리한 시간 : " + (end - start));

	}

}
