package ch02;

public class HeapAreaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello"; // 대문자로 되어있는 데이터는 객체 타입(heap에 저장)'h' 'e' 'l' 'l' 'o' 로 구성된 문자열
		Object obj = new Object(); // 1. 4 바이트를 확보 2. 힙 영역에 Object 객체 생성 3. 주소를 1번에 확보한 변수에 할당
		Object obj2 = new Object(); // 1. 4 바이트를 확보 2. 힙 영역에 Object 객체 생성 3. 주소를 1번에 확보한 변수에 할당
		int value = 3; // 1. 4 바이트 확보 2. 3이라는 값을 1번에 확보한 변수에 할당
		// String str = new String("hello"); // 1. 4 바이트 확보 2. 힙 영역에 String 객체
		// 생성(Hello"), 3. 주소를 1번에 확보한 변수에 할당

		System.out.println(str); // 0x100
		System.out.println(obj); // 0x200
		System.out.println(obj2); // 0x300
		System.out.println(value);

	}

}
