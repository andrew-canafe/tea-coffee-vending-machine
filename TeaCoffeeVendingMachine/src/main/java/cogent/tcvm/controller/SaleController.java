package cogent.tcvm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Sale;
import cogent.tcvm.service.SaleService;
import cogent.tcvm.wrapper.SaleDetails;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SaleController {
	
	@Autowired
	SaleService saleService;
	
	final Logger logger = Logger.getLogger(DrinkController.class);
	
	@GetMapping("/total-sales")
	public ResponseEntity<?> totalSales() {
		logger.info("Retrieving total sales");
		List<Sale> sales = saleService.findAll();
		SaleDetails sDetails = new SaleDetails(sales);
		return ResponseEntity
				.ok().body(sDetails);
	}	
	
}
