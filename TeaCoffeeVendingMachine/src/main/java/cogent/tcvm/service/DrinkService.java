package cogent.tcvm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Drink;
import cogent.tcvm.model.Sale;
import cogent.tcvm.repository.ContainerRepository;
import cogent.tcvm.repository.DrinkRepository;
import cogent.tcvm.repository.SaleRepository;

@Service
public class DrinkService {
	
	@Autowired
	private DrinkRepository dRepo;
	
	@Autowired
	private ContainerRepository cRepo;
	
	@Autowired
	private SaleRepository saleRepo;
	
	public Sale chooseDrink(int amt, String d) {
		Drink drink = new Drink();
		Sale sale = new Sale();
		LocalDate today = LocalDate.now();
		List<Drink> allDrinks = dRepo.findAll();
		for(Drink drk: allDrinks) {
			if(drk.getName().equals(d)) {
				//also if(checkIngredientSufficient)
				drink.setName(d);
				drink.setCost(drk.getCost());
				drink.setDrinkId(drk.getDrinkId());
				sale.setDate(today);
				sale.setDrink(drk);
				sale.setNumberOfCups(amt);
				sale.setSaleId((int) (saleRepo.count()+1));
				//call updateContainer()
				return saleRepo.save(sale);
			}
		}	
		return sale;
	}
	

	  public boolean checkIngredientSufficiency(Sale sale) {
		  boolean allGood = true;
		  List<Container> allContainers = cRepo.findAll();
		  for(Container c: allContainers) {
		  	
		  } return allGood;
	  }
	
	//public void updateContainer(Container container, Sale sale) {
		//need the drink-container relationship
		//find the drinkId from the sale
		//find the container associated with the drink
		//access the ingredients for said drink
		//subtract the required drink amount from each ingredient 
		//save each container to the cRepo
	//}
	
	
	
}
