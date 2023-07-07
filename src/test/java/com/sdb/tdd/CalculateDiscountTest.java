package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();
	public static final String SOFTWARE_DEVELOPMENT_BOOK_I = "Clean Code (Robert Martin, 2008)";

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		String book = SOFTWARE_DEVELOPMENT_BOOK_I;
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}
}
