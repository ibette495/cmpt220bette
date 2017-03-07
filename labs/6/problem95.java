import java.util.Calendar;
import java.util.GregorianCalendar;

public class problem95 {
	public static void main(String[] args){
		Calendar calender = new GregorianCalendar();
		
		System.out.println("The Year is: " + calender.get(Calendar.YEAR));
		System.out.println("The Month is: " + calender.get(Calendar.MONTH));
		System.out.println("The Day of The Month is: " + calender.get(Calendar.DAY_OF_MONTH));
		
		calender.setTimeInMillis(123456789765L);
		System.out.println("The Year is: " + calender.get(Calendar.YEAR));
		System.out.println("The Month is: " + calender.get(Calendar.MONTH));
		System.out.println("The Day of The Month is: " + calender.get(Calendar.DAY_OF_MONTH));
		
	}

}
