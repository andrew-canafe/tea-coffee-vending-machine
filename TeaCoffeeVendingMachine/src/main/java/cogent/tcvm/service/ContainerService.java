package cogent.tcvm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Container;
import cogent.tcvm.model.Ingredient;
import cogent.tcvm.model.Refill;
import cogent.tcvm.repository.ContainerRepository;
import cogent.tcvm.repository.IngredientRepository;
import cogent.tcvm.repository.RefillRepository;

@Service
public class ContainerService {

	@Autowired
	private ContainerRepository containerRepository;

	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Autowired
	private RefillRepository refillRepository;

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

	public void setContainer(Container container, float fill, float availableNew) {
		container.setAvailable(availableNew);
		containerRepository.save(container);
		
		Refill refill = new Refill();
		refill.setRefillId((int) refillRepository.count()+1);
		refill.setQuantity(1);
		refill.setUnitQuantity(fill);
		refill.setDate(LocalDate.now());
		refill.setIngredient(container.getIngredient());
		refillRepository.save(refill);
	}

}
