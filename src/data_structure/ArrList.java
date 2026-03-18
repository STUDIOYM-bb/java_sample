package data_structure;

public class ArrList<E> {
	private E[] arr;
	private int size;

	public ArrList() {
		arr = (E[]) (new Object[2]); // arr.length = 2 <- capacity
		size = 0; // 배열 안에 담겨있는 항목의 숫자
	}

	// isEmpty(), size(), add(), remove(), toString()

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public boolean add(E e) {
		if (arr.length == size) {
			resize(arr.length * 2);
		}
		arr[size] = e; // 맨 마지막에 추가한다. <==== (1. 여기 구현해보기)
		size++;// 배열에 담긴 데이터의 수, 즉 배열의 크기를 하나 증가한다. <==== (1. 여기 구현해보기)
		return true;
	}

	public E remove(int index) {

		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		E removed = arr[index]; // index 위치에 있는 객체 항목을 지우기 전에 저장한다. <==== (2. 여기 구현해보기)
		arr[index] = null;// index 위치에 있는 객체 항목을 지운다. 참조타입이므로 null 값을 할당한다. <==== (2. 여기 구현해보기)
		size--; // 배열의 크기를 하나 감소한다.

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		} // capacity 확인 용 테스트 코드
		if (size > 0 && size <= arr.length / 4) {
			resize(arr.length / 2);

		}
		return removed;
	}

	public E get(int index) {
		return arr[index];
	}

	private void resize(int length) {
		E[] t = (E[]) (new Object[length]); // 배열의 크기를 반으로 줄이거나, 두 배 증가시킨다.
		for (int i = 0; i < size; i++) {
			t[i] = arr[i];
		}
		arr = t;

	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				list += arr[i];
			} else {
				list += arr[i] + ",";
			}
		}
		return "ArrList : [" + list + "]";
	}

}