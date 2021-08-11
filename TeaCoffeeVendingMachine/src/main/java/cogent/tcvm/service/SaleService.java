package cogent.tcvm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Sale;
import cogent.tcvm.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepo;
	
	public List<Sale> findAll(){
		return saleRepo.findAll();
	}
	

}
