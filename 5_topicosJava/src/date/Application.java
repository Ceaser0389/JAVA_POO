package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	
	Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	
	System.out.println(sdf.format(d));
	
	Calendar cal =  Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY,4);
	d  =cal.getTime();
	
	System.out.println(sdf.format(d));
	
	int  minutes = cal.get(Calendar.MINUTE);
	int  month   = cal.get(Calendar.MONTH);
	
	System.out.println("Minutes :" + minutes);
	System.out.println("Month :" + month);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();

	}

}
