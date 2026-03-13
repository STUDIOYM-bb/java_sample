package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exer11_6_homework {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		Random random = new Random();
		while (lotto.size() < 6) {
			int a = 0;
			a = random.nextInt(45) + 1;
			if (!lotto.contains(a)) {
				lotto.add(a);
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);

	}

}
