package data_structure;

public class SLinkedList<E> {
	private Node<E> head;
	private int size;

	public SLinkedList() {
		head = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	private class Node<E> {
		E item;
		Node<E> next;

		public Node(E item, Node<E> next) {

		}
	}

}
