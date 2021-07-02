package exercises9to13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarPractice {

	public static void main(String[] args) {
		// Exercise 9
		ZoneId EST = ZoneId.of("America/New_York");
		LocalDateTime today = LocalDateTime.now(EST);
		System.out.println("The date and time is " + LocalDateTime.now(EST));
		// Exercise 11
		System.out.println("The month is " + today.getMonth());
		System.out.println("The day is " + today.getDayOfMonth());
		System.out.println("The year is " + today.getYear());
		System.out.println("The hour is " + today.getHour());
		System.out.println("The minute is " + today.getMinute());
		// Exercise 13
		Scanner input = new Scanner(System.in);
		int month, year;
		System.out.println("Enter the year followed by the month you want to search ");
		year = input.nextInt();
		month = input.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		System.out.println("The number of days is " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		input.close();
	}

}
