package cogent.tcvm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Drink;
import cogent.tcvm.repository.DrinkRepository;
import cogent.tcvm.repository.SaleRepository;

@RestController
@RequestMapping("/api")
public class SaleController {
	
	@Autowired
	SaleRepository saleRepo;
	
	@Autowired
	DrinkRepository drinkRepo;
	
	@GetMapping("/total-cups")
	public int getTotalCups() {
		return saleRepo.getTotalCups();
	}
	
	@GetMapping("/total-cups-for-a-drink")
	public int getTotalCupsForDrinks(@RequestParam int id) {
		Drink d = new Drink();
		Optional<Drink> drink = drinkRepo.findById(id);
		if(drink.isPresent()) {
			return saleRepo.getTotalCupsForADrink(id);
		}
		return d.getDrinkId();
	}

	@GetMapping("/total-cost")
	public float getTotalCost() {
		return drinkRepo.getTotalDrinkCost();
	}
	
	@GetMapping("/total-cost-for-a-drink")
	public float getTotalCostForDrinks(@RequestParam int id) {
		Drink d = new Drink();
		Optional<Drink> drink = drinkRepo.findById(id);
		if(drink.isPresent()) {
			return drinkRepo.getTotalCostForADrink(id);
		}
		return d.getDrinkId();
	}
	
	
}
