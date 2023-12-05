package oopsConcepts;

import corejavaConcepts.StringDemo;

public class ObjectDemo {
	
	//ClassName refANme = new ClassName();
	static ClassDemo abc = new ClassDemo();
	static StringDemo obj = new StringDemo();
	
	public static void main(String[] args) {
		abc.add();
		abc.stringConcatination();
		//add();
		System.out.println(abc.firstName);
		System.out.println(abc.a);
		
		System.out.println(obj.b);

	}

}
