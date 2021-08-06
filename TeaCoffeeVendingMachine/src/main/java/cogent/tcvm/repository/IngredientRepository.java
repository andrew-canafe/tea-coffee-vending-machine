package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

	Ingredient findByName(String name);

}
