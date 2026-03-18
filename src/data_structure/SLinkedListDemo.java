package data_structure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();

		System.out.println(list.size());

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		System.out.println(list);

		System.out.println(list.get(0));

		System.out.println(list.remove());

		System.out.println(list);
		list.remove(); // 맨 앞의 항목을 지우는 것으로 removeFirst()

		list.remove();
	}

}
