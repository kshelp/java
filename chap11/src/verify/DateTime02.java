package verify;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.Calendar

		// Calendar c2 = new Calendar();

		// Calendar c1 = new GregorianCalendar();//업캐스팅

		Calendar c = Calendar.getInstance();

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;// 0~11
		int d = c.get(Calendar.DATE);

		int h1 = c.get(Calendar.HOUR); // 12시간
		int ap = c.get(Calendar.AM_PM); // 0:오전
										// 1:오후
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24시간
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		System.out.print(y + "년 " + m + "월 " + d + "일 ");

		int w = c.get(Calendar.DAY_OF_WEEK);// 1~7
		// System.out.println("w=" + w);
		// 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.print("(" + week[w - 1] + "요일) ");

		if (ap == 0) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		System.out.println(h1 + ":" + mm + ":" + s);
	}

}
