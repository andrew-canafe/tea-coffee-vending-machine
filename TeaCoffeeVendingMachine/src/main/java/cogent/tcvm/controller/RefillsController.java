package cogent.tcvm.controller;

import javax.persistence.EntityNotFoundException;

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
	public ResponseEntity<?> getRefillDetails() {
		Refills allDays = refsServ.getAllDays();
		Refills today = refsServ.getToday();
		
		return ResponseEntity.ok(new RefillDetails(allDays, today));
	}
}
