package corejavaConcepts;

public class MethodDemo {
	// Add method
	public static void add() {
		int a = 90;
		int b = 80;
		System.out.println("Add results is: " + (a + b));
	}
	public static void sub() {
		int a = 90;
		int b = 80;
		System.out.println("Sub results is: " + (a - b));
	}
	public static void mul() {
		int a = 90;
		int b = 80;
		System.out.println("Mul results is: " + (a *b));
	}
	public static void main(String[] args) {
		System.out.println("I am Main Method");
		// Method calling
		add();
		sub();
		mul();
		add();
	}

}
