package edu.cuny.citytech.cst.repository;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.dto.ETF;

public class T1_ETFRepository {

	@Test
	public void t1(){
		var repository = new ETFRepository();
		
		List<ETF> list = repository.findAll();
		
		list.forEach(System.out::println);
		
		
	}

	@Test
	public void t2(){
		var repository = new ETFRepository();
		
		List<ETF> list = repository.find(e -> e.getFrequency().equals("Monthly"));
		
		list.forEach(System.out::println);
		System.out.println("Size: " + list.size() + "\nDeveloper: Usman, Muhammad");
		
		
		
	}
}
