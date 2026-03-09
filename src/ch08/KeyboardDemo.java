package ch08;

import java.util.Objects;

public class KeyboardDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		if (m1.equals(m2)) {
			System.out.println(m1 + " 마우스 입니다.");
		} else {
			System.out.println("서로 다른 마우스입니다.");
		}

		Keyboard k1 = new Keyboard("logitech", "L001", 10000);
		Keyboard k2 = new Keyboard("logitech", "l002", 12000);

		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		if (k1.equals(k2)) {
			System.out.println(k1 + " 키보드 입니다.");
		} else {
			System.out.println("서로 다른 키보드입니다.");
		}

	}

}

class Keyboard {
	// 변수
	String name;
	String model;
	int price;

	// 생성자
	public Keyboard(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Keyboard keyboard) {
			System.out.println(this.hashCode() + ":" + keyboard.hashCode());
			return this.hashCode() == keyboard.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, model, price);
	}

	@Override
	public String toString() {
		return "Keyboard [name=" + name + "]";
	}

}

class Mouse {
	// 변수
	String name;

	// 생성자
	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Mouse mouse) {
			return this.name.equals(mouse.name);
		}
		return false;

	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + "]";
	}

}
