package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Ingredient;

public interface ContainerRepository extends JpaRepository<Container, Integer> {

	Container findByIngredient(Ingredient ingredient);

}
