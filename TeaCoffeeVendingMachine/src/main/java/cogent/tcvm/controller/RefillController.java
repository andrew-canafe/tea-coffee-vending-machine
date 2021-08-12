package cogent.tcvm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Refill;
import cogent.tcvm.service.RefillService;
import cogent.tcvm.wrapper.RefillDetails;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RefillController {

	@Autowired
	RefillService refillService;
	
	final Logger logger = Logger.getLogger(DrinkController.class);
	
	@GetMapping("/refill-details")
	public ResponseEntity<?> getRefillDetails() {
		List<Refill> refillList = refillService.getAllRefills();
		logger.info("Retrieving Refill Details");
		return ResponseEntity.ok().body(new RefillDetails(refillList));
	}

}
