
package uk.co.it.modular.dates.builder;

import java.util.Calendar;
import java.util.Date;

/**
 * Builder of {@link Date} objects. This class is intended to be used internally to the builder classes
 * 
 * @author Stewart Bissett
 */
public class DateTimeBuilder {

	private final Calendar calendar = Calendar.getInstance();

	public DateTimeBuilder(final int date, final int month, final int year) {
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		if (calendar.getActualMinimum(Calendar.DATE) > date || date > calendar.getActualMaximum(Calendar.DATE)) {
			throw new IllegalArgumentException("Date must be between 1 and " + calendar.getActualMaximum(Calendar.DATE) + " inclusive");
		}
		calendar.set(year, month, date, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}

	/**
	 * Return a {@link Date} instance at the specified hour, minute, second and a millisecond
	 */
	public Date at(final int hour, final int min, final int sec, final int milli) {
		checkAndSet(calendar, Calendar.HOUR_OF_DAY, "Hour", hour);
		checkAndSet(calendar, Calendar.MINUTE, "Minute", min);
		checkAndSet(calendar, Calendar.SECOND, "Seconds", sec);
		checkAndSet(calendar, Calendar.MILLISECOND, "Milliseconds", milli);
		return calendar.getTime();
	}

	/**
	 * Return a {@link Date} instance at the specified hour, minute, and second and a millisecond value of 0
	 */
	public Date at(final int hour, final int min, final int sec) {
		return at(hour, min, sec, 0);
	}

	private void checkAndSet(final Calendar calendar, final int datefield, final String label, final int value) {
		int minValue = calendar.getActualMinimum(datefield), maxValue = calendar.getActualMaximum(datefield);
		if (minValue > value || value > maxValue) {
			throw new IllegalArgumentException(label + " must be between " + minValue + " and " + maxValue + " inclusive");
		}
		calendar.set(datefield, value);
	}
}
