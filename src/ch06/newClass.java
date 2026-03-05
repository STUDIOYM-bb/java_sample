package ch06;

public class newClass {

	public static void main(String[] args) {
		C c = new C();

	}

}

class A {
	A() {
		System.out.println("A 생성자 실행");
	}
}

class B extends A {
	B() {
		System.out.println("B 생성자 실행");
	}
}

class C extends B {
	C() {
		System.out.println("C 생성자 실행");
	}
}