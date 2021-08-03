package cogent.tcvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.RefillDetails;
import cogent.tcvm.model.Refills;
import cogent.tcvm.service.RefillsService;

@RestController
@RequestMapping("/api")
public class RefillsController {

	@Autowired
	RefillsService refsServ;
	
	@GetMapping("/refill-details")
	public ResponseEntity<RefillDetails> getRefillDetails() {
		Refills refsAllDays = refsServ.getRefillsAllDays();
		Refills refsToday = refsServ.getRefillsToday();
		
		return ResponseEntity.ok(new RefillDetails(refsAllDays, refsToday));
	}
}
