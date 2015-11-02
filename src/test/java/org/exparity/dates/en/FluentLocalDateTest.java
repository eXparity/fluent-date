package org.exparity.dates.en;

import static org.exparity.dates.en.FluentLocalDate.*;
import static org.exparity.hamcrest.date.LocalDateMatchers.isDay;
import static org.junit.Assert.assertThat;

import java.time.DateTimeException;
import java.time.Month;

import org.junit.Test;

/**
 * Unit test for the {@link FluentLocalDate} class
 *
 * @author Stewart Bissett
 */
public class FluentLocalDateTest {

	@Test
	public void canCreateDateInJanuary() {
		assertThat(JAN(1, 2014), isDay(2014, Month.JANUARY, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInJanuary() {
		JAN(32, 2014);
	}

	@Test
	public void canCreateDateInFebruary() {
		assertThat(FEB(1, 2014), isDay(2014, Month.FEBRUARY, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnDateInFebruary() {
		FEB(29, 2014);
	}

	@Test
	public void canCreateDateInMarch() {
		assertThat(MAR(1, 2014), isDay(2014, Month.MARCH, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInMarch() {
		MAR(32, 2014);
	}

	@Test
	public void canCreateDateInApril() {
		assertThat(APR(1, 2014), isDay(2014, Month.APRIL, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInApril() {
		APR(31, 2014);
	}

	@Test
	public void canCreateDateInMay() {
		assertThat(MAY(1, 2014), isDay(2014, Month.MAY, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInMay() {
		MAY(32, 2014);
	}

	@Test
	public void canCreateDateInJune() {
		assertThat(JUN(1, 2014), isDay(2014, Month.JUNE, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInJune() {
		JUN(31, 2014);
	}

	@Test
	public void canCreateDateInJuly() {
		assertThat(JUL(1, 2014), isDay(2014, Month.JULY, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInJuly() {
		JUL(32, 2014);
	}

	@Test
	public void canCreateDateInAugust() {
		assertThat(AUG(1, 2014), isDay(2014, Month.AUGUST, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInAugust() {
		AUG(32, 2014);
	}

	@Test
	public void canCreateDateInSeptember() {
		assertThat(SEP(1, 2014), isDay(2014, Month.SEPTEMBER, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInSeptember() {
		SEP(31, 2014);
	}

	@Test
	public void canCreateDateInOctober() {
		assertThat(OCT(1, 2014), isDay(2014, Month.OCTOBER, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInOctober() {
		OCT(32, 2014);
	}

	@Test
	public void canCreateDateInNovember() {
		assertThat(NOV(1, 2014), isDay(2014, Month.NOVEMBER, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInNovember() {
		NOV(31, 2014);
	}

	@Test
	public void canCreateDateInDecember() {
		assertThat(DEC(1, 2014), isDay(2014, Month.DECEMBER, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnBadDateInDecember() {
		DEC(32, 2014);
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnZeroDate() {
		assertThat(JAN(0, 2014), isDay(2014, Month.JANUARY, 1));
	}

	@Test(expected = DateTimeException.class)
	public void canErrorOnNegativeDate() {
		assertThat(JAN(-1, 2014), isDay(2014, Month.JANUARY, 1));
	}

}
