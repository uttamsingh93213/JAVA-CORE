package in.co.rays.basisc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy/H:mm:ss:SSS");
		String str = Format.format(d);
		System.out.println("Date:" + str);
		String str1 = "01/02/2023";
		Date d1 = Format.parse(str1);
		System.out.println(d1);
	}
}
