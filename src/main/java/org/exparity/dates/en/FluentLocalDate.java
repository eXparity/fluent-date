package org.exparity.dates.en;

import java.time.LocalDate;
import java.time.Month;

/**
 * A static factory for creating instances of {@link LocalDate} instances using
 * a readable fluent syntax. To create {@link LocalDate} instances for a
 * specific time use {@link FluentLocalDateTime}.
 * </p>
 * For example:
 *
 * <pre>
 * LocalDate myBirthday = FluentLocalDate.AUG(9, 1975)
 * </pre>
 *
 * @author Stewart Bissett
 */
public abstract class FluentLocalDate {

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in January in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate JAN(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.JANUARY, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in February
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate FEB(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.FEBRUARY, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in March in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate MAR(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.MARCH, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in April in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate APR(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.APRIL, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in May in the
	 * given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate MAY(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.MAY, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in June in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate JUN(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.JUNE, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in July in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate JUL(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.JULY, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in August in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate AUG(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.AUGUST, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in September
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate SEP(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.SEPTEMBER, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in October in
	 * the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate OCT(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.OCTOBER, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in November
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate NOV(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.NOVEMBER, dayOfMonth);
	}

	/**
	 * Create a {@link LocalDate} instance for the given LocalDate in December
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDate DEC(final int dayOfMonth, final int year) {
		return LocalDate.of(year, Month.DECEMBER, dayOfMonth);
	}
}
