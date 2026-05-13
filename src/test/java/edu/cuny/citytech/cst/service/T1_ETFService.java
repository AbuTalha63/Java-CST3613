package edu.cuny.citytech.cst.service;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1_ETFService {

	@Test
	@DisplayName("Selecting the right ETFs - should fail")
	public void t1() {
		ETFService service = new ETFService();
		
		var list = service.getBestDividendstocks();
		
		list.forEach(System.out::println);
		
		assertTrue(list.size() < 300 && list.size() > 20, "Error: not enough data");
		
		
		
	}
}
