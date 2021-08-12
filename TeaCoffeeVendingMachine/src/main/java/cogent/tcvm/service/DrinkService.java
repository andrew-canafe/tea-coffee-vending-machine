package cogent.tcvm.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Drink;
import cogent.tcvm.model.DrinkIngredient;
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
		List<Drink> drinksThatMatch = dRepo.findByName(d);
		for(Drink drk: drinksThatMatch) {
			if(drk.getName().equals(d)) {
				drink.setName(d);
				drink.setCost(drk.getCost());
				drink.setDrinkId(drk.getDrinkId());
				sale.setDate(today);
				sale.setDrink(drk);
				sale.setNumberOfCups(amt);
				sale.setSaleId((int) (saleRepo.count()+1));
				if(checkIngredientSufficiency(sale)) {
					updateIngredients(sale);
					return saleRepo.save(sale);
				}
			}
		}
		return sale;
	}
	

	  public boolean checkIngredientSufficiency(Sale sale) {
		  boolean allGood = true; 
		  List<Container> allContainers = cRepo.findAll();
		  Set<DrinkIngredient> drinkIngredients = sale.getDrink().getDrinkIngedients();
		  for(DrinkIngredient i : drinkIngredients) {
			 int dId = i.getDrinkIngredient().getIngredient().getIngredientId();
			  for(Container c: allContainers) {
				  int cId = c.getIngredient().getIngredientId();
				  if((dId == cId) && sale.getNumberOfCups()*i.getUnitQuantity() > c.getAvailable() ) {
					  allGood = false;
				  }
			  } 
		  }
		  return allGood;
	  }
	
	public void updateIngredients(Sale sale) {
		//find the drinkId from the sale
	  	Set<DrinkIngredient> drinkIngredients = sale.getDrink().getDrinkIngedients();
	  	List<Container> allContainers = cRepo.findAll();
	  	for(DrinkIngredient d : drinkIngredients) {
	  		int dId = d.getDrinkIngredient().getIngredient().getIngredientId();
	  		for(Container c: allContainers) {
	  			int cId = c.getIngredient().getIngredientId();
	  			if(dId == cId) {
	  				c.setAvailable(c.getAvailable() - (sale.getNumberOfCups()*d.getUnitQuantity()));
	  				cRepo.save(c);
	  			}
	  		}
	  	}
	}


	public List<Drink> findAll() {
		List<Drink> allDrinks = dRepo.findAll();
		return allDrinks;
	}

}
