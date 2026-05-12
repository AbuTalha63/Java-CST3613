package edu.cuny.citytech.cst.repository;
//Developer: Usman, Muhammad | @AbuTalha63 on GitHub
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.learning.java.data.repository.ExcelRepository;

import edu.cuny.citytech.cst.dto.ETF;

public class ETFRepository {

	
	static List<ETF> etfList = new ArrayList<>();
	
	static {
		String fileName = System.getenv("CST_3613_STOCK_DATA") + "/etf/Top ETFs by Quant 2025-01-16.xlsx";

		var repository = new ExcelRepository<ETF>(fileName, 0, 1);				
		repository.populate(ETF.class, etfList::add);
	}
	
	public List<ETF> findAll() {
		
		return etfList;
	}

	public List<ETF> find(Predicate<ETF> predicate) {
		
		return etfList.stream().filter(predicate).toList();
	}
	
}
