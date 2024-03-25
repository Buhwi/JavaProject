package work08Test01;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String args[]) {
		Calendar today = Calendar.getInstance();
		int time = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+time+"시 "+minute+"분입니다.");
		if(4 < time && time < 12)
			System.out.println("Good Morning");
		else if(time < 18)
			System.out.println("Good Afternoon");
		else if(time < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
}
