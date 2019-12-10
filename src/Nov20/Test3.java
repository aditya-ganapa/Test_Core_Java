package Nov20;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant instant=Instant.now();
		Instant instant2=instant.plus(2, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);
		System.out.println(Duration.between(instant, instant2).toMinutes());
		System.out.println(Duration.between(instant, instant2).toHours());
		Duration gap=Duration.ofSeconds(13);
		Instant later=instant.plus(gap);
		System.out.println(later);
		System.out.println(ChronoUnit.MILLIS.between(instant, instant2));
	}

}
