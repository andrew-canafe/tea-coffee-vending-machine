package cogent.tcvm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Ingredient;
import cogent.tcvm.repository.ContainerRepository;
import cogent.tcvm.repository.IngredientRepository;

@Service
public class ContainerService {

	@Autowired
	private ContainerRepository containerRepository;
	
	@Autowired
	private IngredientRepository ingredientRepository;

	public List<Container> getAllContainers() {
		return containerRepository.findAll();
	}
	
	public Container setContainer(Container cons) {
		return containerRepository.save(cons);
	}

	public Container getContainerByIngredientName(String name) {
		Ingredient ingredient = ingredientRepository.findByName(name);
		return containerRepository.findByIngredient(ingredient);
	}
	
}
