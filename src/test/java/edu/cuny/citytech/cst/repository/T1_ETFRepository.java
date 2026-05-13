package edu.cuny.citytech.cst.repository;
import static org.junit.jupiter.api.Assertions.assertTrue;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.dto.ETF;

public class T1_ETFRepository {

	@Test
	public void t1(){
		var repository = new ETFRepository();
		
		List<ETF> list = repository.findAll();
		
//		list.forEach(System.out::println);
		
		assertTrue(list.size() > 1_500);
		
		
	}

	@Test
	public void t2(){
		var repository = new ETFRepository();
		
		Predicate<ETF> predicates = e -> e.getFrequency().equals("Monthly");
		predicates = predicates.and( e -> e.getDividends().contains("A") || e.getDividends().contains("B") );
		predicates = predicates.and( e -> !e.getDividends().contains("B-") );
		predicates = predicates.and( e -> e.getYield() > 0.07 );
		predicates = predicates.and( e -> e.getAumInBillions() > 1 );

		
		List<ETF> list = repository.find(predicates);
		
		
		list.forEach(System.out::println);
		System.out.println("Size: " + list.size() + "\nDeveloper: Usman, Muhammad");
		
		
		
	}
}
