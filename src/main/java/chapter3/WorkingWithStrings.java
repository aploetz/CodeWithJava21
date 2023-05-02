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
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Company: " + company);
		
	}

}
