package cogent.tcvm.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Containers;
import cogent.tcvm.repository.ContainersRepository;

@Service
public class ContainersService {

	@Autowired
	private ContainersRepository consRepo;
	
	public Containers getMaxCapacity() throws EntityNotFoundException {
		return consRepo.getById(1);
	}
	
	public Containers getAvailable() throws EntityNotFoundException {
		return consRepo.getById(2);
	}
	
	public Containers setContainers(Containers cons) {
		return consRepo.save(cons);
	}
	
}
