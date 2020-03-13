package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class USTravelHistoryPractice {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		String[] dates = { "2015-02-27", "2016-09-28", "2016-10-27", "2017-09-24", "2017-10-13", "2019-06-06",
				"2020-01-19" };

		LocalDate arrivalDate1 = LocalDate.parse(dates[0], formatter);

		LocalDate arrivalDate2 = LocalDate.parse(dates[2], formatter);

		LocalDate arrivalDate3 = LocalDate.parse(dates[4], formatter);

		LocalDate arrivalDate4 = LocalDate.parse(dates[6], formatter);

		LocalDate departureDate1 = LocalDate.parse(dates[1], formatter);

		LocalDate departureDate2 = LocalDate.parse(dates[3], formatter);

		LocalDate departureDate3 = LocalDate.parse(dates[5], formatter);

		Period lengthofStay1 = Period.between(arrivalDate1, departureDate1);

		Period lengthofStay2 = Period.between(arrivalDate2, departureDate2);

		Period lengthofStay3 = Period.between(arrivalDate3, departureDate3);

		Period lengthofCurrentStay = Period.between(arrivalDate4, LocalDate.now());

		System.out.println("Length of first stay: " + lengthofStay1.toTotalMonths() + " months");

		System.out.println("Length of second stay: " + lengthofStay2.toTotalMonths() + " months");

		System.out.println("Length of third stay: " + lengthofStay3.toTotalMonths() + " months");

		System.out.println("Length of the current stay: " + lengthofCurrentStay.toTotalMonths() + " months");

		Period periodOfPossibleStay = Period.ofYears(6);

		LocalDate maxOutDate = arrivalDate1.plus(periodOfPossibleStay)
				.plus(Period.between(departureDate1, arrivalDate2)).plus(Period.between(departureDate2, arrivalDate3))
				.plus(Period.between(departureDate3, arrivalDate4));

		System.out.println(Period.between(departureDate1, arrivalDate2));

		System.out.println(Period.between(departureDate2, arrivalDate3));

		System.out.println(Period.between(departureDate3, arrivalDate4));

		// System.out.println("Total number of days spent outside of US : " +
		// periodOutSideOfUS.getDays() + " days");

		System.out.println("Your H1B Max out date is: " + maxOutDate);

	}

}
