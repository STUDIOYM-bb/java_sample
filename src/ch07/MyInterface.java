package ch07;

public interface MyInterface {
	// 상수
	int MAX = 10; // == public static final 생략 // int MAX = 10;
	int MIN = 1; // == public static final 생략 // int MIN = 1;

	// abstract 메서드
	void sayHello(); // == public abstract 생략 // void sayHEllo();

	void sayHi(); // == public abstract 생략 // void sayHi();

	default void talk() {
	}

	default void sing() {
	}
}

class MyClass implements MyInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("hi");
	}

}

class YourClass implements MyInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("hi");
	}

	@Override
	public void talk() {
		System.out.println("talk");

	}
}
