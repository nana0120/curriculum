package study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Study {
	
	public static void main(String args[]) {
		
		Date now = new Date();
		System.out.println(now);
		
		Calendar calendar = Calendar.getInstance();
		//実値が0から始まるから
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+ 1);
		System.out.println(calendar.get(Calendar.DATE));
		
		calendar.add(calendar.YEAR, 1);
		calendar.add(calendar.MONTH, 2);
		calendar.add(calendar.DAY_OF_MONTH, 15);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		
		printLeapYear(calendar.get(Calendar.YEAR));
	}
	private static void printLeapYear(final int year) {
		System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
	}

}
