package ch06;

public class Exer6_4 {

	public static void main(String[] args) {
		Parant parant = new Child();
		System.out.println(parant.name);
		parant.print();

	}

}

class Parant {
	// 필드
	String name = "영조";

	// 메서드
	void print() {
		System.out.println("영조입니다");
	}
	// 생성자
}

class Child extends Parant {
	// 필드
	String name = "사도세자";

	// 메서드
	@Override
	void print() {
		System.out.println("사도세자입니다");
	}

	// 생성자
}