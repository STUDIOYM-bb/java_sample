package nakseo;

public class Backjoon {

	public static void main(String[] args) {
		int e1 = 0;
		int e2 = 0;
		while (true) {
			e1 = (int) (6 * Math.random() + 1);
			e2 = (int) (6 * Math.random() + 1);
			System.out.printf("( %d , %d )\n", e1, e2);

			if (e1 + e2 == 5) {
				break;
			} else {
			}

		}
	}

}
