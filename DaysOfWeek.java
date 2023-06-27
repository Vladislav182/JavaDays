package Canyon;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String choice = "";

		while (!choice.equals("end")) {
			System.out.print("Choose :: <days> or <end> ?");
			choice = scanner.next();
			if (choice.equals("days")) {
				System.out.println("Enter abbreviation of day <Mo , Tu , We, Th ,Fr ,Sa ,Su>");
				choice = scanner.next();
				switch (choice) {
				case "Mo":
					System.out.println("Monday");
					break;
				case "Tu":
					System.out.println("Tuesday");
					break;
				case "We":
					System.out.println("Wednesday");
					break;
				case "Th":
					System.out.println("Thursday");
					break;
				case "Fr":
					System.out.println("Friday");
					break;
				case "Sa":
					System.out.println("Saturday");
					break;
				case "Su":
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Spell check please!");
				}
			}
		}
		System.out.println("Goodbye!");

	}

}
