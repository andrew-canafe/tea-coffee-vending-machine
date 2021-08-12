package cogent.tcvm.junit;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cogent.tcvm.model.Drink;
import cogent.tcvm.model.Sale;
import cogent.tcvm.service.DrinkService;

public class IngredientTestSuite {
	
	@Autowired
	private DrinkService dServ;
	
	@Autowired
	private Sale sale;
	
	@Before
	public void init()
	{
		LocalDate today = LocalDate.now();
		sale = new Sale(8, new Drink(), 30, today);
	}
	
	@Test
	public void IngredientSufficiencyTest() {
		assertEquals(dServ.checkIngredientSufficiency(sale), false);
	}

}
