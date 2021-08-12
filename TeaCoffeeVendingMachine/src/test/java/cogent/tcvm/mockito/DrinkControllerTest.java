package cogent.tcvm.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import cogent.tcvm.controller.DrinkController;
import cogent.tcvm.model.Drink;
import cogent.tcvm.model.Sale;
import cogent.tcvm.repository.DrinkRepository;
import cogent.tcvm.service.DrinkService;
import cogent.tcvm.wrapper.DrinkDetails;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DrinkControllerTest {
	
	@MockBean
	private DrinkService dService;
	
	@Autowired
	private DrinkController dCtlr;
	
	@Test
	public void chooseDrinkTest() {
		int amt = 2;
		String d = "Black Tea";
		LocalDate today = LocalDate.now();
		Sale sale = new Sale(8,new Drink(), 2, today);
		when(dService.chooseDrink(amt, d)).thenReturn(sale);
		assertEquals(ResponseEntity.ok().body(sale), dCtlr.chooseDrink(amt, d));
	}
	
	@Test
	public void getDrinkDetailsTest() {
		List<Drink> drinks = new ArrayList<>();
		DrinkDetails dDetails = new DrinkDetails(drinks);
		when(dService.findAll()).thenReturn(drinks);
		assertEquals(ResponseEntity.ok().body(dDetails), dCtlr.getDrinkDetails());
	}

}
