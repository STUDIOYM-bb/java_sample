package ch06;

public class Exer6_5 {

	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };
		for (Phone phone : phones) {
			if (phone instanceof Smartphone smartphone) {
				smartphone.playGame();
			} else if (phone instanceof Telephone telephone) {
				telephone.autoAnswering();
			} else if (phone instanceof Phone) {
				phone.talk();
			}
		}
	}

}

class Phone {
	// 필드
	protected String owner;

	// 메서드
	void talk() {
		System.out.println(owner + "가 통화중입니다.");
	}

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
}

class Telephone extends Phone {
	// 필드
	private String when;
	// 메서드

//	public String getWhen() {
//		return when;
//	}
//
//	public void setWhen(String when) {
//		this.when = when;
//	}

	void autoAnswering() {
		System.out.println(owner + "가 부재중이니, " + when + " 에 전화 요망.");
	}

	// 생성자
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

}

class Smartphone extends Telephone {
	// 필드
	private String game;

	// 메서드
//	public String getGame() {
//		return game;
//	}
//
//	public void setGame(String game) {
//		this.game = game;
//	}

	void playGame() {
		System.out.println(owner + " 가 " + game + "게임 중입니다.");
	}

	// 생성자
	public Smartphone(String owner, String game) {
		super(owner, "내일");
		this.game = game;

	}
}
