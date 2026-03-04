package ch05;

public class ArrayDemo {

	public static void main(String[] args) {
		// 요구사항 : 세 명의 학생의 점수를 각각 저장하고 합계와 평균을 구해주세요.

		// 변수에는 정해진 크기의 데이터를 한 개 담아놓을 수 있다.
		int score1 = 100;
		int score2 = 90;
		int score3 = 85;

		int total = score1 + score2 + score3;
		double avg = total / (double) 3;

		String res = String.format("합계 = %d, 평균 = %.2f 입니다.", total, avg);
		System.out.println(res);
		// 정해진 크기의 여러 개(다섯 개)의 데이터를 담으려면 ?? ==> 배열
		int[] scores = { 100, 90, 80, 95, 90 };
		System.out.println(scores.length);
		total = 0;
		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i];

		}
		res = String.format("합계 = %d, 평균 = %.2f 입니다.", total, total / (double) scores.length);
		System.out.println(res);
	}

}
