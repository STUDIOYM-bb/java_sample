package ch09;

public class GenericMethodDemo2 {

	public static void main(String[] args) {
		// a[4] 의 값보다 큰 티켓의 개수 구하는 문제
		Ticket[] a = { new Ticket(11000), new Ticket(15000), new Ticket(8000), new Ticket(20000), new Ticket(10000) };
		Line[] b = { new Line(11000), new Line(5000) };
		System.out.println(countGT(a, a[4]));
		System.out.println(countGT(b, b[1]));
	}

	static <T extends Comparable> int countGT(T[] arr, T t) {
		int count = 0;
		for (T ticket : arr) {
			if (ticket.compareTo(t) > 0) {
				count++;
			}
		}
		return count;
	}

}

class Ticket implements Comparable {
	int price;

	public Ticket(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Ticket ticket) {
			return this.price - ticket.price;
		}
		return -999999;
	}

}

class Line implements Comparable {
	int line;

	public Line(int line) {
		this.line = line;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Line line) {
			return this.line - line.line;
		}
		return -999999;
	}

}