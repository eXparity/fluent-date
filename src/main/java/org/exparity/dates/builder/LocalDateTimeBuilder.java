package org.exparity.dates.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Builder of {@link LocalDateTime} and {@link ZonedDateTime} objects.
 *
 * @author Stewart Bissett
 */
public class LocalDateTimeBuilder {

	private final LocalDate date;

	public LocalDateTimeBuilder(final LocalDate date) {
		this.date = date;
	}

	/**
	 * Return a {@link LocalDateTime} instance at the specified time of day
	 *
	 * @param time the time of the day
	 */
	public LocalDateTime at(final LocalTime time) {
		return LocalDateTime.of(date, time);
	}

	/**
	 * Return a {@link ZonedDateTime} instance at the specified time of day in
	 * the given time zone
	 *
	 * @param time the time of the day
	 * @param zone the time zone
	 */
	public ZonedDateTime at(final LocalTime time, final ZoneId zone) {
		return at(time).atZone(zone);
	}

	/**
	 * Return a {@link LocalDateTime} instance at the specified hour
	 *
	 * @param hour the hour of the day
	 */
	public LocalDateTime at(final int hour) {
		return at(LocalTime.of(hour, 0));
	}

	/**
	 * Return a {@link ZonedDateTime} instance at the specified hour in the time
	 * zone
	 *
	 * @param hour the hour of the day
	 * @param zone the time zone to use
	 */
	public ZonedDateTime at(final int hour, final ZoneId zone) {
		return at(hour).atZone(zone);
	}

	/**
	 * Return a {@link LocalDateTime} instance at the specified hour and minute
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 */
	public LocalDateTime at(final int hour, final int minute) {
		return at(LocalTime.of(hour, minute));
	}

	/**
	 * Return a {@link ZonedDateTime} instance at the specified hour and minute
	 * in the time zone
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 * @param zone the time zone to use
	 */
	public ZonedDateTime at(final int hour, final int minute, final ZoneId zone) {
		return at(hour, minute).atZone(zone);
	}

	/**
	 * Return a {@link LocalDateTime} instance at the specified hour, minute,
	 * and second
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 * @param second the second of the minute
	 */
	public LocalDateTime at(final int hour, final int minute, final int second) {
		return at(LocalTime.of(hour, minute, second));
	}

	/**
	 * Return a {@link ZonedDateTime} instance at the specified hour, minute,
	 * and second in the time zone.
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 * @param second the second of the minute
	 * @param timezone the time zone to use
	 */
	public ZonedDateTime at(final int hour, final int minute, final int second, final ZoneId timezone) {
		return at(hour, minute, second).atZone(timezone);
	}

	/**
	 * Return a {@link LocalDateTime} instance at the specified hour, minute,
	 * second and a millisecond
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 * @param second the second of the minute
	 * @param nanos the nanoseconds of the second
	 */
	public LocalDateTime at(final int hour, final int minute, final int second, final int nanos) {
		return at(LocalTime.of(hour, minute, second, nanos));
	}

	/**
	 * Return a {@link ZonedDateTime} instance at the specified hour, minute,
	 * second and millisecond in the time zone adjusted to current time zone
	 *
	 * @param hour the hour of the day
	 * @param minute the minute of the hour
	 * @param second the second of the minute
	 * @param nanos the nanoseconds of the second
	 * @param zone the time zone to use
	 */
	public ZonedDateTime at(final int hour, final int minute, final int second, final int nanos, final ZoneId zone) {
		return at(hour, minute, second, nanos).atZone(zone);
	}
}
