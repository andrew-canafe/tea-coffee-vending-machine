package cogent.tcvm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.repository.ContainersRepository;
import cogent.tcvm.repository.RefillsRepository;

@Service
public class SaleService {
	
	@Autowired
	private ContainersRepository consRepo;
	
	@Autowired
	private RefillsRepository refRepo;
	
	

}
