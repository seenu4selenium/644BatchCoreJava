package corejavaConcepts;

public class StringDemo {
	public static void main(String[] args) {

		String b = "Hi All";
		String c = "My Mobile No#: 9874563210";
		System.out.println(b);
		System.out.println(c);
		System.out.println(b + c);
		System.out.println(b + " " + c);

		// Length(): start from 1
		System.out.println(b.length());

		// Index():start from 0
		// Get the 4th position character from b String
		String a = "ABCDE";
		System.out.println(a.length());
		// charAt(): Returns the char value at the specified index.
		System.out.println(a.charAt(3));
		System.out.println(c.charAt(6));

		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());

		String d = "AppLe";
		String e = "aPplE";

		// verify the Strings are matching or not?
		// equals():Compares this string to the specified object
		if (d.equals(e)) {
			System.out.println("Both the Strings are Equal");
		} else {
			System.out.println("Both the Strings are NOT Equal");
		}
		
		//equalsIgnoreCase():
		//Compares this string to the specified object, it will ignore the upper case char
		if (d.equalsIgnoreCase(e)) {
			System.out.println("Both the Strings are Equal***");
		} else {
			System.out.println("Both the Strings are NOT Equal***");
		}
		
		
		String f = "Hi Bhargavi, how is sessions going on?";
		//String 'f' contains Bhargavi name or not?
//Contains():Returns true if this string contains the specified sequence of char values.
		if (f.contains("Bhargavi")) {
			System.out.println("Bhargavi char values is displayed in a String");
		} else {
			System.out.println("Bhargavi char values is NOT displayed in a String");
		}
		
		if (f.contentEquals("Hi Bhargavi, how is sessions going on")) {
			System.out.println("Bhargavi char values is displayed in a String");
		} else {
			System.out.println("Bhargavi char values is NOT displayed in a String");
		}
	}
}
