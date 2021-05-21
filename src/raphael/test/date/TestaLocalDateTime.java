package raphael.test.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaLocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.of(2019, 5, 19, 12, 8);
		System.out.println(ldt);
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.withHour(3));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime lt = LocalTime.now();
		System.out.println(dtf2.format(lt));
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.now();
		System.out.println(dtf3.format(ld));
		
		Period p = Period.of(2021, 05, 19);
		System.out.println(p);
	}

}
