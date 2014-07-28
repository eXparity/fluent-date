
package org.exparity.dates.en;

import java.util.Calendar;
import java.util.Date;
import org.exparity.dates.builder.DateTimeBuilder;

/**
 * A static factory for creating instances of {@link Date} instances using a readable fluent syntax. All dates are created at midnight at the start of the given date. To create
 * {@link Date} instances for a specific time use {@link FluentDateTime}.</p> For example:
 * 
 * <pre>
 * Date myBirthday = Dates.AUG(9, 1975)
 * </pre>
 * 
 * @author Stewart Bissett
 */
public abstract class FluentDate {

	/**
	 * Create a {@link Date} instance for the given date in January in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date JAN(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JANUARY,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in February in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date FEB(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.FEBRUARY,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in March in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date MAR(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.MARCH,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in April in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date APR(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.APRIL,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in May in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date MAY(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.MAY,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in June in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date JUN(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JUNE,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in July in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date JUL(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JULY,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in August in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date AUG(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.AUGUST,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in September in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date SEP(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.SEPTEMBER,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in October in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date OCT(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.OCTOBER,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in November in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date NOV(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.NOVEMBER,
				year).at(0, 0, 0);
	}

	/**
	 * Create a {@link Date} instance for the given date in December in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static Date DEC(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.DECEMBER,
				year).at(0, 0, 0);
	}
}
