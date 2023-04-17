package chapter2;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 255: ");

		Scanner inputScanner = new Scanner(System.in);
		String inputStr = inputScanner.nextLine();
		inputScanner.close();

		int number = Integer.parseInt(inputStr);
		
		System.out.printf("The character for ASCII code %d is %c", number, (char) number);
	}

}
