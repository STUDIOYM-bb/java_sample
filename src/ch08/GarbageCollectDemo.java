package ch08;

public class GarbageCollectDemo {

	public static void main(String[] args) {
		Garbage g = new Garbage(0);
		System.gc();
	}

}

class Garbage {
	// 필드
	public int no;

	// 생성자
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성됨 \n", no);
	}

	protected void finalize() {
		System.out.printf("Garbage(%d) 수거됨 \n", no);

	}

}