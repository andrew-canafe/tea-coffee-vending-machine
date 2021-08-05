package cogent.tcvm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Container;
import cogent.tcvm.repository.ContainerRepository;

@Service
public class ContainerService {

	@Autowired
	private ContainerRepository containerRepository;

	public List<Container> getAllContainers() {
		return containerRepository.findAll();
	}
	
	public Container setContainer(Container cons) {
		return containerRepository.save(cons);
	}
	
}
