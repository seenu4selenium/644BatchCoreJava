package corejavaConcepts;

public class Assignment3 {

	public static void main(String[] args) {
		// While booking flight tkt, offer will provide flight people.
//		if gender is male= 25% offer;
//		if gender is female= 30% offer;
//		if gender is custom= 20% offer;

		String gender = "dsghdjfgh";

		if (gender.equals("male")) {
			System.out.println("you will get 25% offer");
		} else if (gender.equals("female")) {
			System.out.println("you will get 30% offer");
		} else if (gender.equals("custom")) {
			System.out.println("you will get 20% offer");
		}else {
			System.out.println("Please type gender value with-in this 'male/female/custom'");
		}

	}

}
