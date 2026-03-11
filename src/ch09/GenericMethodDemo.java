package ch09;

public class GenericMethodDemo { // Outer Class

	// Inner Class == 중첩 클래스
	static class Utils {
		public static <T extends Number> void showArrays(T[] a) {
			for (T i : a) {
				System.out.println(i);
			}
		}

//		public static void showArrays(String[] a) {
//			for (String string : a) {
//				System.out.println(string);
//			}
//		}
//
//		public static void showArrays(Person[] a) {
//			for (Person person : a) {
//				System.out.println(person);
//			}
//		}
//
//		public static void showArrays(long[] a) {
//			for (long l : a) {
//				System.out.println(l);
//			}
//		}

	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4 };
		String[] arr2 = { "a", "b", "c" };
		Long[] arr3 = { 10L, 20L, 30L };

		Utils.showArrays(arr1);
		Utils.showArrays(arr2);
		Utils.showArrays(arr3);
	}

}
