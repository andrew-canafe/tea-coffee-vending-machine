package cogent.tcvm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.tcvm.model.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {

	List<Drink> findByName(String name);

}
