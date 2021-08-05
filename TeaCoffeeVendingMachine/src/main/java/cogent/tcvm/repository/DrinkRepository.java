package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer>{

	List<Drink> findByDate(LocalDate date);

}
