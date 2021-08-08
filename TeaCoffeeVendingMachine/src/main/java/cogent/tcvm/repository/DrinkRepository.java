package cogent.tcvm.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {

	List<Drink> findByName(String name);
	
}
