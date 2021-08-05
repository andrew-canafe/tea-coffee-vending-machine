package cogent.tcvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Drink;
import cogent.tcvm.service.ContainersService;
import cogent.tcvm.service.RefillsService;

@RestController
@RequestMapping("/api")
public class DrinkController {
	
	@Autowired
	RefillsService refsServ;
	
	@Autowired
	ContainersService consServ;
	
	@GetMapping("/choose-drink")
	public ResponseEntity<?> chooseDrink(@RequestParam int amt, @RequestParam String drink ){

		if(amt <= 0 || (!drink.equals("tea") && !drink.equals("coffee") && !drink.equals("blacktea") && !drink.equals("blackcoffee"))) {
			return ResponseEntity
					.badRequest()
					.body("Error: Cannot complete request!");
		}
		else if(drink.equals("tea")) {
			//if milk container isEmpty, bad Request
		}
		return ResponseEntity
				.ok("Successful!");
	}
	
}
