package corejavaConcepts;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {

		int a = 180;
		int b = 180;

		if (a != b) {
			System.out.println("both are equal***");

		} else {
			System.out.println("both are NOT equal***");
		}

		// Verify which variable is large value
//		while verify the if else block, system will check the condition
//		the condition is TRUE, if block will execute
//		the condition is FALSE, else block will execute

		if (a > b) {
			System.out.println("a is large value");
		} else if (a < b) {
			System.out.println("b is large value");
		} else {
			System.out.println("both are equal");
		}

		char c = 'y';
		char d = 'e';
		if (c > d) {// 171>145 [ASCII table]
			System.out.println("c is large value");
		} else {
			System.out.println("e is large value");
		}

	}

}
