package cogent.tcvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Refill;
import cogent.tcvm.service.RefillService;
import cogent.tcvm.wrapper.RefillDetails;

@RestController
@RequestMapping("/api")
public class RefillController {

	@Autowired
	RefillService refillService;
	
	@GetMapping("/refill-details")
	public ResponseEntity<?> getRefillDetails() {
		List<Refill> refillList = refillService.getAllRefills();
		
		return ResponseEntity.ok(new RefillDetails(refillList));
	}
	
}
