
package org.exparity.dates.en;

import static java.util.TimeZone.getTimeZone;
import static org.exparity.dates.en.FluentDateTime.*;
import static org.exparity.hamcrest.date.DateMatchers.isInstant;
import static org.junit.Assert.assertThat;

import java.time.Month;
import java.util.TimeZone;

import org.exparity.hamcrest.date.DateMatchers;
import org.junit.Test;

/**
 * Unit test for the {@link FluentDateTimes} class
 *
 * @author Stewart Bissett
 */
public class FluentDateTimeTest {

	private static final TimeZone BST = getTimeZone("GMT+1:00");
	private static final TimeZone GMT = getTimeZone("GMT");

	@Test
	public void canCreateDateWithAnHour() {
		assertThat(JAN(1, 2014).at(9), DateMatchers.isInstant(2014, Month.JANUARY, 1, 9, 0, 0, 0));
	}

	@Test
	public void canCreateDateWithAnHourAndZone() {
		TimeZone currentDefault = TimeZone.getDefault();
		TimeZone.setDefault(GMT);
		try {
			assertThat(JAN(1, 2014).at(9, BST), isInstant(2014, Month.JANUARY, 1, 8, 0, 0, 0));
		} finally {
			TimeZone.setDefault(currentDefault);
		}
	}

	@Test
	public void canCreateDateWithAMinute() {
		assertThat(JAN(1, 2014).at(9, 15), isInstant(2014, Month.JANUARY, 1, 9, 15, 0, 0));
	}

	@Test
	public void canCreateDateWithAMinuteAndZone() {
		TimeZone currentDefault = TimeZone.getDefault();
		TimeZone.setDefault(GMT);
		try {
			assertThat(JAN(1, 2014).at(9, 15, BST), isInstant(2014, Month.JANUARY, 1, 8, 15, 0, 0));
		} finally {
			TimeZone.setDefault(currentDefault);
		}
	}

	@Test
	public void canCreateDateWithASecond() {
		assertThat(JAN(1, 2014).at(9, 15, 30), isInstant(2014, Month.JANUARY, 1, 9, 15, 30, 0));
	}

	@Test
	public void canCreateDateWithASecondAndZone() {
		TimeZone currentDefault = TimeZone.getDefault();
		TimeZone.setDefault(GMT);
		try {
			assertThat(JAN(1, 2014).at(9, 15, 30, BST), isInstant(2014, Month.JANUARY, 1, 8, 15, 30, 0));
		} finally {
			TimeZone.setDefault(currentDefault);
		}
	}

	@Test
	public void canCreateDateWithAMillisecond() {
		assertThat(JAN(1, 2014).at(9, 15, 30, 500), isInstant(2014, Month.JANUARY, 1, 9, 15, 30, 500));
	}

	@Test
	public void canCreateDateWithAMillisecondAndZone() {
		TimeZone currentDefault = TimeZone.getDefault();
		TimeZone.setDefault(GMT);
		try {
			assertThat(JAN(1, 2014).at(9, 15, 30, 500, BST), isInstant(2014, Month.JANUARY, 1, 8, 15, 30, 500));
		} finally {
			TimeZone.setDefault(currentDefault);
		}
	}

	@Test
	public void canCreateDateInJanuary() {
		assertThat(JAN(1, 2014).at(9, 30, 15), isInstant(2014, Month.JANUARY, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJanuary() {
		JAN(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInFebruary() {
		assertThat(FEB(1, 2014).at(9, 30, 15), isInstant(2014, Month.FEBRUARY, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnDateInFebruary() {
		FEB(29, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInMarch() {
		assertThat(MAR(1, 2014).at(9, 30, 15), isInstant(2014, Month.MARCH, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMarch() {
		MAR(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInApril() {
		assertThat(APR(1, 2014).at(9, 30, 15), isInstant(2014, Month.APRIL, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInApril() {
		APR(31, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInMay() {
		assertThat(MAY(1, 2014).at(9, 30, 15), isInstant(2014, Month.MAY, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMay() {
		MAY(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInJune() {
		assertThat(JUN(1, 2014).at(9, 30, 15), isInstant(2014, Month.JUNE, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJune() {
		JUN(31, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInJuly() {
		assertThat(JUL(1, 2014).at(9, 30, 15), isInstant(2014, Month.JULY, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJuly() {
		JUL(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInAugust() {
		assertThat(AUG(1, 2014).at(9, 30, 15), isInstant(2014, Month.AUGUST, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInAugust() {
		AUG(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInSeptember() {
		assertThat(SEP(1, 2014).at(9, 30, 15), isInstant(2014, Month.SEPTEMBER, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInSeptember() {
		SEP(31, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInOctober() {
		assertThat(OCT(1, 2014).at(9, 30, 15), isInstant(2014, Month.OCTOBER, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInOctober() {
		OCT(32, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInNovember() {
		assertThat(NOV(1, 2014).at(9, 30, 15), isInstant(2014, Month.NOVEMBER, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInNovember() {
		NOV(31, 2014).at(9, 30, 15);
	}

	@Test
	public void canCreateDateInDecember() {
		assertThat(DEC(1, 2014).at(9, 30, 15), isInstant(2014, Month.DECEMBER, 1, 9, 30, 15, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInDecember() {
		DEC(32, 2014).at(9, 30, 15);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnZeroDate() {
		JAN(0, 2014).at(9, 30, 15);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeDate() {
		JAN(-1, 2014).at(9, 30, 15);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnInvalidSecond() {
		JAN(1, 2014).at(9, 15, 60);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeSecond() {
		JAN(1, 2014).at(9, 15, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnInvalidHour() {
		JAN(1, 2014).at(24, 30, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeHour() {
		JAN(1, 2014).at(-1, 30, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnInvalidMinute() {
		JAN(1, 2014).at(9, 60, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeMinute() {
		JAN(1, 2014).at(9, -1, 30);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnInvalidMillisecond() {
		JAN(1, 2014).at(9, 60, 30, 1000);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeMillisecond() {
		JAN(1, 2014).at(9, 60, 30, -1);
	}

}
