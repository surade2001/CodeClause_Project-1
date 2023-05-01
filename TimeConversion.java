package assingment;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
	public static void main(String[] args) {
		// Create a formatter for displaying the time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

		// Get the current time in the UTC timezone
		LocalTime utcTime = LocalTime.now(ZoneOffset.UTC);

		// Convert to other timezones
		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime newYorkTime = ZonedDateTime.ofInstant(Instant.now(), newYorkZone);

		ZoneId londonZone = ZoneId.of("Europe/London");
		ZonedDateTime londonTime = ZonedDateTime.ofInstant(Instant.now(), londonZone);

		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoTime = ZonedDateTime.ofInstant(Instant.now(), tokyoZone);

		ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime indiaTime = ZonedDateTime.ofInstant(Instant.now(), indiaZone);

		// Display the converted times
		System.out.println("UTC Time: " + utcTime.format(formatter));
		System.out.println("New York Time: " + newYorkTime.format(formatter));
		System.out.println("London Time: " + londonTime.format(formatter));
		System.out.println("Tokyo Time: " + tokyoTime.format(formatter));
		System.out.println("India Time: " + indiaTime.format(formatter));
	}
}
