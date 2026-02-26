package ch03;

public class SwitchDemo {

	public static void main(String[] args) {
		// switch 문 - 구간 선택때는 사용 불가 (점수 범위 등) / 실수 인 경우에도 사용 불가
		// switch 는 낙하방식 / 1에서 충족하면 밑에 다 실행 / 2면 1은 건너뛰고 2 밑부터 다 실행 / break 랑 결합해서 사용해야함
		// <- 자바 14 이전버전
		String yoil = "월";

		switch (yoil) {

		case "월", "화", "수", "목", "금" -> System.out.println("평일입니다.");
		case "토", "일" -> System.out.println("주말입니다.");

		}

		String result = switch (yoil) {

		case "월", "화", "수", "목", "금" -> "평일입니다.";
		case "토", "일" -> "주말입니다.";
		default -> "유효하지 않은 요일입니다.";
		};

		System.out.println(result);

		String obj = "참새";
		String kind = switch (obj) {
		case "호랑이", "사자":
			yield "표유류";
		default:
			yield "...";
		};
		System.out.println(kind);

	}

}
