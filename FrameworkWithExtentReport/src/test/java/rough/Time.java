package rough;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Time {

	@Test
	public void timeTest() {

		// LocalDate now = LocalDate.now();
		// System.out.println(now);

		// int hour=LocalTime.now().getHour();
		// System.out.println(hour);

		// int minute= LocalTime.now().getMinute();
		// System.out.println(minute);

		// int sec=LocalTime.now().getSecond();
		// System.out.println(sec);

	}

	public static void main(String[] args) {
		//ff2HQNVUBETZQnBuVEBYHfltAoIhrkFiUmPAleMf0qg10BP3up
		System.out.println(RandomStringUtils.randomAlphanumeric(50000));
		System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US));

		String s = DateTimeFormatter.ofPattern("MM-dd-yyyyHH:mm:ss").format(LocalDateTime.now());
		s = s.replace("-", "").replace(":", "");

		System.out.println(s);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		

	}

}
