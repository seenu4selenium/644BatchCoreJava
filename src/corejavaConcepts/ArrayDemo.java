package corejavaConcepts;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] a = { "hi", "sdgdsg", "345345","weyrhdf", "353463", "sdr4325#@$%$@#%" };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 4576567 };

		System.out.println("a Array Length is: " + a.length);// 5
		System.out.println("b Array Length is: " + b.length);

		System.out.println(a[2]);
		System.out.println(b[4]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("**************************");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
