package cogent.tcvm.controller;

import java.util.List;

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

	@GetMapping("/total-sales")
	public ResponseEntity<?> totalSales() {
		List<Sale> sales = saleService.findAll();
		SaleDetails sDetails = new SaleDetails(sales);
		return ResponseEntity.ok().body(sDetails);
	}

}
