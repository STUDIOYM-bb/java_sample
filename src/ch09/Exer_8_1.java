package ch09;

public class Exer_8_1 {

	public static void main(String[] args) {
		Box<Integer> i = new Box<>(); // Integer 타입 Box i 생성
		i.set(Integer.valueOf(100)); // i 매개변수 t에 100 값 전달 후 필드 t 에 저장
		System.out.println(i.get()); // 필드 t에 저장된 값 반환

		Box<String> s = new Box<>(); // String 타입 Box s 생성
		s.set("만능이네!"); // s 매개변수 t에 만능이네! 라는 String 값 전달 후 필드 t 에 저장
		System.out.println(s.get()); // 필드 t에 저장된 값 반환
	}

}

class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}