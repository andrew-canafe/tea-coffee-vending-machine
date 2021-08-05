package cogent.tcvm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Drink;
import cogent.tcvm.repository.DrinkRepository;

@Service
public class DrinkService {
	
	@Autowired
	private DrinkRepository drinkRepo;
	
	List<Drink> findByDate(LocalDate date){
		return drinkRepo.findByDate(date);
	}
	LocalDate today = LocalDate.now();
	
	
}
