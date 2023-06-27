package Canyon;

import java.util.*;
import java.util.Dictionary;
import java.util.Scanner;
import java.util.Hashtable;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Dictionary<String, String> weekDays = new Hashtable<>();
		weekDays.put("Mo", "Monday");
		weekDays.put("Tu", "Tuesday");
		weekDays.put("Wd", "Wednesday");
		weekDays.put("Th", "Thursday");
		weekDays.put("Fd", "Friday");
		weekDays.put("Sa", "Saturday");
		weekDays.put("Su", "Sunday");

		System.out.print("Day (Mo, Tu, Wd, Th, Fd, Sa, Su): ");
		String weekDay = scan.nextLine();

		System.out.println("Day of the week: " + weekDays.get(weekDay));

		System.out.println("Goodbye");

	}
}
