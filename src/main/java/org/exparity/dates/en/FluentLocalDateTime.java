package org.exparity.dates.en;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;

import org.exparity.dates.builder.LocalDateTimeBuilder;

/**
 * A static factory for creating instances of {@link LocalDateTime} or
 * {@link ZonedDateTime} instances with a time component using a readable fluent
 * syntax.
 * </p>
 * For example:
 *
 * <pre>
 * Date myBirthdayLunch = FluentDateTime.AUG(9, 1975).at(12, 30)
 * </pre>
 *
 * @author Stewart Bissett
 */
public abstract class FluentLocalDateTime {

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * January in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder JAN(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.JANUARY, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * February in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder FEB(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.FEBRUARY, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * March in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder MAR(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.MARCH, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * April in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder APR(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.APRIL, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in May
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder MAY(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.MAY, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in June
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder JUN(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.JUNE, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in July
	 * in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder JUL(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.JULY, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * August in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder AUG(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.AUGUST, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * September in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder SEP(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.SEPTEMBER, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * October in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder OCT(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.OCTOBER, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * November in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder NOV(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.NOVEMBER, dayOfMonth));
	}

	/**
	 * Create a {@link LocalDateTimeBuilder} instance for the given date in
	 * December in the given year
	 *
	 * @param dayOfMonth the day of the month.
	 * @param year the year.
	 */
	public static LocalDateTimeBuilder DEC(final int dayOfMonth, final int year) {
		return new LocalDateTimeBuilder(LocalDate.of(year, Month.DECEMBER, dayOfMonth));
	}
}
