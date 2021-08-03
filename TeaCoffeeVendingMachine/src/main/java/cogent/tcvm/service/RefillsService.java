package cogent.tcvm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.tcvm.model.Refills;
import cogent.tcvm.repository.RefillsRepository;

@Service
public class RefillsService {

	@Autowired
	private RefillsRepository refsRepo;
	
	private Refills refComb(Refills r1, Refills r2) {
		r1.setTeaRefill(r1.getTeaRefill()+r2.getTeaRefill());
		r1.setCoffeeRefill(r1.getCoffeeRefill()+r2.getCoffeeRefill());
		r1.setSugarRefill(r1.getSugarRefill()+r2.getSugarRefill());
		r1.setWaterRefill(r1.getWaterRefill()+r2.getWaterRefill());
		r1.setMilkRefill(r1.getMilkRefill()+r2.getMilkRefill());
		return r1;
	}
	
	public Refills getRefillsAllDays() {
		return refsRepo.findAll().stream().collect(Refills::new, this::refComb, this::refComb);
	}
	
	public Refills getRefillsToday() {
		List<Refills> refsList = refsRepo.findByDate(LocalDate.now());
		Refills refs = null;
		
		if (refsList.size() == 1) {
			refs = refsList.get(0);
		}
		
		return refs;
	}
	
	public Refills setRefills(Refills refs) {
		return refsRepo.save(refs);
	}
}
