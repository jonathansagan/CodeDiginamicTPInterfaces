package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Instant;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

public class Controles {

	public static Date CtrlDate(String d) throws ExceptionDate {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		Date dt = new Date();
		try {

			dt = (Date) formatter.parse(d);

		} catch (Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}

	public static void CtrlInt(String ns) throws ExceptionInt {
		int n = 0;
		try {
			n = Integer.parseInt(ns);

		} catch (Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}

	}

}
