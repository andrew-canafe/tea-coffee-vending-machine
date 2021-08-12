package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Ingredient;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Integer> {

	Container findByIngredient(Ingredient ingredient);

}
