package chapter3;

public class WorkingWithStrings {

	public static void main(String[] args) {

		String email = "victoria.ploetz@largecompany.com";
		
		// get string positions
		int dotPos = email.indexOf('.');
		int atPos = email.indexOf('@');
		int dot2Pos = email.indexOf('.', atPos + 1);
		
		String firstName = email.substring(0, dotPos);
		String lastName = email.substring(dotPos + 1, atPos);
		String company = email.substring(atPos + 1, dot2Pos);
		
		firstName = properCase(firstName);
		lastName = properCase(lastName);
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Company: " + company);
		System.out.println();
		
		if (firstName.equals("Victoria")) {
			System.out.println("Your name is Victoria!");
		} else {
			System.out.println("Sorry, your name is NOT Victoria.");
		}
		
	}

	private static String properCase(String name) {
		// grab the first character and convert it to uppercase
		char firstLetter = Character.toUpperCase(name.charAt(0));
		
		// return firstLetter concatenated with the substring of name from position 1 through to the end.
		return firstLetter + name.substring(1);
	}
}
