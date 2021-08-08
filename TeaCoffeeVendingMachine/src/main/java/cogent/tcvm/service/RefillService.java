package cogent.tcvm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Refill;
import cogent.tcvm.repository.RefillRepository;

@Service
public class RefillService {

	@Autowired
	private RefillRepository refillRepository;

	public List<Refill> getAllRefills() {
		return refillRepository.findAll();
	}

	public Refill setRefill(Refill refs) {
		return refillRepository.save(refs);
	}

}
