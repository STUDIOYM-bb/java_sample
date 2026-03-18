package data_structure;

public class ArrListDemo {

	public static void main(String[] args) {
		ArrList<Integer> list = new ArrList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		System.out.println(list.remove(3) + "이 삭제되었습니다.");
		System.out.println(list);
		System.out.println(list.remove(2) + "이 삭제되었습니다.");
		System.out.println(list);
		System.out.println(list.remove(1) + "이 삭제되었습니다.");
		System.out.println(list);

		System.out.println(list.get(list.size() - 1));

		System.out.println("현재 동적 배열의 크기는 : " + list.size());

		System.out.println(list.isEmpty());

	}

}
