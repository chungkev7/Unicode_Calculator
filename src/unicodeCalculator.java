import java.util.Scanner;

public class unicodeCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a string: ");
		
		String inputtedLines = input.nextLine();
		
		System.out.println("Please enter another string: ");

		String inputtedLinesTwo = input.nextLine();

		int stringOne = 0;

		int stringTwo = 0;

		for (int i = 0; i < inputtedLines.length(); i++) {

			char characterLines = inputtedLines.charAt(i);

			int valueOfChar = characterLines;

			stringOne += valueOfChar;
		}

		for (int i = 0; i < inputtedLinesTwo.length(); i++) {

			char characterLinesTwo = inputtedLinesTwo.charAt(i);

			int valueOfCharTwo = characterLinesTwo;

			stringTwo += valueOfCharTwo;
		}

		int theDifference = Math.abs(stringOne - stringTwo);

		System.out.println("The absolute difference between the two strings is: " + theDifference);

	}
}

