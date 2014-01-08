
package uk.co.it.modular.dates.en;

import java.util.Calendar;
import uk.co.it.modular.dates.builder.DateTimeBuilder;

/**
 * A static factory for creating instances of {@link Date} instances with a time component using a readable fluent syntax.</p>For example:
 * 
 * <pre>
 * Date myBirthdayLunch = Dates.AUG(9, 1975).at(12, 30)
 * </pre>
 * 
 * @author Stewart Bissett
 */
public abstract class FluentDateTime {

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in January in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder JAN(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JANUARY,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in February in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder FEB(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.FEBRUARY,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in March in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder MAR(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.MARCH,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in April in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder APR(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.APRIL,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in May in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder MAY(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.MAY,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in June in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder JUN(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JUNE,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in July in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder JUL(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.JULY,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in August in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder AUG(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.AUGUST,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in September in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder SEP(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.SEPTEMBER,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in October in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder OCT(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.OCTOBER,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in November in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder NOV(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.NOVEMBER,
				year);
	}

	/**
	 * Create a {@link DateTimeBuilder} instance for the given date in December in the given year
	 * @param date the day of the month.
	 * @param year the year.
	 */
	public static DateTimeBuilder DEC(final int date, final int year) {
		return new DateTimeBuilder(date,
				Calendar.DECEMBER,
				year);
	}
}
