package mypractice.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * A class for practicing the date formats Created by CO21321 on 2/20/2018.
 */
public class DateFormatPracticeHarness {
	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(
				"______________________________FULL FORMAT________________________________________________________\n");

		System.out.println("The date in default format is " + DateFormat.getDateInstance(DateFormat.FULL).format(date));

		System.out.println(
				"The date in UK format is " + DateFormat.getDateInstance(DateFormat.FULL, Locale.UK).format(date));

		System.out.println("The date in FRANCE format is "
				+ DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE).format(date));

		System.out.println(
				"\n______________________________LONG FORMAT________________________________________________________\n");

		System.out.println("The date in default format is " + DateFormat.getDateInstance(DateFormat.LONG).format(date));

		System.out.println(
				"The date in UK format is " + DateFormat.getDateInstance(DateFormat.LONG, Locale.UK).format(date));

		System.out.println("The date in FRANCE format is "
				+ DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE).format(date));

		System.out.println(
				"\n______________________________MEDIUM FORMAT________________________________________________________\n");

		System.out
				.println("The date in default format is " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));

		System.out.println(
				"The date in UK format is " + DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK).format(date));

		System.out.println("The date in FRANCE format is "
				+ DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.FRANCE).format(date));

		System.out.println(
				"\n______________________________SHORT FORMAT________________________________________________________\n");

		System.out
				.println("The date in default format is " + DateFormat.getDateInstance(DateFormat.SHORT).format(date));

		System.out.println(
				"The date in UK format is " + DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK).format(date));

		System.out.println("The date in FRANCE format is "
				+ DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE).format(date));
	}
}
