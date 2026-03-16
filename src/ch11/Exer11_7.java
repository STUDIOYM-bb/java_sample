package ch11;

import java.util.HashMap;
import java.util.Map;

public class Exer11_7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = ""; // 최고 점수를 받은 아이디를 저장하는 변수
		String minName = ""; // 최저 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int minScore = 100; // 최저 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		double mean = 0.0; // 평균 점수를 저장하는 변수

		// 코드 - (평균 점수 출력(.2f), 최고 점수와 최저 점수 받은 아이디 출력
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			totalScore += value;
			if (value > maxScore) {
				maxScore = value;
				maxName = key;
			}
			if (value < minScore) {
				minScore = value;
				minName = key;
			}

		}
		mean = ((double) totalScore / map.size());
		System.out.printf("[평균점수 : %.2f | 최고점수 : %s | 최저점수 : %s]", mean, maxName, minName);
	}
}
