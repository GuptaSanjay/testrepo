import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.of(2017, Month.FEBRUARY, 10);
		System.out.println(ld);
		
		LocalDate sixtyfifth2017 = LocalDate.ofYearDay(2017, 65);
	    System.out.println("SixtyFifth2017="+sixtyfifth2017);
	    
	    LocalTime second =  LocalTime.ofSecondOfDay(12345);
	    System.out.println("12345th Second of day="+second);
	    
	    LocalDateTime localdatetime=LocalDateTime.of(2014, 02, 20, 12, 00);
	    System.out.println("LocalDateTime of 2014-02-20 12:00 is ="+localdatetime);
	    
	    boolean ld1=LocalDate.of(2018,2 , 21).isBefore(LocalDate.now());
	    System.out.println(ld1);
	    
	    LocalDate date4 = LocalDate.now();
        LocalDate date5 = LocalDate.parse("2017-02-05");
        System.out.println(date5.isBefore(date4));  
	    
	}

}
