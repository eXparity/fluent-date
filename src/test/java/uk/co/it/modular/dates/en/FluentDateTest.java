/*
 * Copyright (c) Modular IT Limited.
 */

package uk.co.it.modular.dates.en;

import org.junit.Test;
import uk.co.it.modular.hamcrest.date.Months;
import static org.junit.Assert.assertThat;
import static uk.co.it.modular.dates.en.FluentDate.*;
import static uk.co.it.modular.hamcrest.date.DateMatchers.sameDay;

/**
 * Unit test for the {@link Dates} class
 * 
 * @author Stewart Bissett
 */
public class FluentDateTest {

	@Test
	public void canCreateDateInJanuary() {
		assertThat(JAN(1, 2014), sameDay(2014, Months.JAN, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJanuary() {
		JAN(32, 2014);
	}

	@Test
	public void canCreateDateInFebruary() {
		assertThat(FEB(1, 2014), sameDay(2014, Months.FEB, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnDateInFebruary() {
		FEB(29, 2014);
	}

	@Test
	public void canCreateDateInMarch() {
		assertThat(MAR(1, 2014), sameDay(2014, Months.MAR, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMarch() {
		MAR(32, 2014);
	}

	@Test
	public void canCreateDateInApril() {
		assertThat(APR(1, 2014), sameDay(2014, Months.APR, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInApril() {
		APR(31, 2014);
	}

	@Test
	public void canCreateDateInMay() {
		assertThat(MAY(1, 2014), sameDay(2014, Months.MAY, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInMay() {
		MAY(32, 2014);
	}

	@Test
	public void canCreateDateInJune() {
		assertThat(JUN(1, 2014), sameDay(2014, Months.JUN, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJune() {
		JUN(31, 2014);
	}

	@Test
	public void canCreateDateInJuly() {
		assertThat(JUL(1, 2014), sameDay(2014, Months.JUL, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInJuly() {
		JUL(32, 2014);
	}

	@Test
	public void canCreateDateInAugust() {
		assertThat(AUG(1, 2014), sameDay(2014, Months.AUG, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInAugust() {
		AUG(32, 2014);
	}

	@Test
	public void canCreateDateInSeptember() {
		assertThat(SEP(1, 2014), sameDay(2014, Months.SEP, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInSeptember() {
		SEP(31, 2014);
	}

	@Test
	public void canCreateDateInOctober() {
		assertThat(OCT(1, 2014), sameDay(2014, Months.OCT, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInOctober() {
		OCT(32, 2014);
	}

	@Test
	public void canCreateDateInNovember() {
		assertThat(NOV(1, 2014), sameDay(2014, Months.NOV, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInNovember() {
		NOV(31, 2014);
	}

	@Test
	public void canCreateDateInDecember() {
		assertThat(DEC(1, 2014), sameDay(2014, Months.DEC, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnBadDateInDecember() {
		DEC(32, 2014);
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnZeroDate() {
		assertThat(JAN(0, 2014), sameDay(2014, Months.JAN, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void canErrorOnNegativeDate() {
		assertThat(JAN(-1, 2014), sameDay(2014, Months.JAN, 1));
	}
}
