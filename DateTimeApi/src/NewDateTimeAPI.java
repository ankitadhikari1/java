import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class NewDateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		Instant i = Instant.now();
		System.out.println(i);
		

	}

}
