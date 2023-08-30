package day8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateTime {

	public static void main(String[] args) {
		dateTimes();
	}
	
	static void dateTimes() {
		LocalDate date = LocalDate.now();
		System.out.println(date); //tgl skrng (2023-08-30)
		
		LocalTime time = LocalTime.now();
		System.out.println(time); // jam skrng sesuai dr laptop (09:19:36.457498)
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); // tgl dan jam  (2023-08-30T09:19:36.458010)
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDate = dateTime.format(formatDate);
		System.out.println(formattedDate); // 30-08-2023 09:19:36
		
		// add day
		System.out.println(date.plusDays(15));
		System.out.println(date.plusDays(-5));
		//add month
		System.out.println(date.plusMonths(1));
		//add years
		System.out.println(date.plusYears(27));
		
		//add hour in localtime
		System.out.println(time.plusHours(5));
		
		// add day in localDateTime (tgl + time)
		System.out.println(dateTime.plusDays(2));
		
		LocalDate startDate = LocalDate.parse("2019-08-30"); // custom tgl yang kita maw
		System.out.println(startDate);
		
		LocalDate endDate = LocalDate.parse("2022-03-29");
		System.out.println(endDate);
		
		// difference between startdate and enddate
		long dayCount = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(dayCount);
		
		long monthCount = ChronoUnit.MONTHS.between(startDate, endDate);
		
		LocalDateTime startDateTime = LocalDateTime.parse("2019-08-20T10:01:00"); // kudu pk T
		LocalDateTime endDateTime = LocalDateTime.parse("2019-08-21T10:01:00");
		
		long hourCount = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		System.out.println(hourCount);
		
		String time2 = "17:03";
		String result = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH:mm"))
				.format(DateTimeFormatter.ofPattern("hh:mm a"));
		System.out.println(result);
		
	}

}
