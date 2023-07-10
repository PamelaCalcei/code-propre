package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}

	public static String formatDefaut(Date date) {
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
	}
}
