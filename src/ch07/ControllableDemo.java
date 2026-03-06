package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
		// 모든 전자제품에는 전원을 온/오프 하는 기능이 있으며, 수리 및 공장초기화를 할 수 있어야 한다.
		// 전자제품 객체는 turnOn() 메서드, turnOff() 메서드로만 전원을 조절할 수 있어야 한다.
		// 수리 및 공장초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한ㄴ다.
		// 수리 기능은 자식 클래스에서 오버라이딩 할 수도 있다.

		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset1();

		Notebook nb = new Notebook();
		nb.inMyBag();
		nb.turnOn();
		nb.turnOff();
		nb.repair();

	}

}

interface Controllable {
	void turnOn();

	void turnOff();

	default void repair() {

	}

//	private void reset() { 밖에서 못 불러다 씀.
//
//	}

	static void reset1() {
		System.out.println("장비를 초기화한다.");
	}
}

interface RemoteControllable extends Controllable {
	void remoteOn();

	void remoteOff();
}

class TV implements Controllable, RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("TV 를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 를 끈다.");
	}

	@Override
	public void repair() {
		System.out.println("TV 를 수리한다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("TV를 리모콘으로 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("TV를 리모콘으로 끈다.");
	}

}

class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다.");
	}

}

interface Portable {
	void inMyBag();
}

class Notebook extends Computer implements Portable {
	@Override
	public void inMyBag() {
		System.out.println("노트북은 가방에 있다.");
	}

	@Override
	public void repair() {
		System.out.println("노트북을 수리한다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}

}