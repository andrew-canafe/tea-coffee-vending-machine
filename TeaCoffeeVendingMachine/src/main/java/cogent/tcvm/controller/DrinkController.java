package cogent.tcvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Drink;
import cogent.tcvm.model.Sale;
import cogent.tcvm.payload.response.MessageResponse;
import cogent.tcvm.service.DrinkService;
import cogent.tcvm.wrapper.DrinkDetails;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class DrinkController {

	@Autowired
	private DrinkService dServ;

	@GetMapping("/choose-drink")
	public ResponseEntity<?> chooseDrink(@RequestParam int amt, @RequestParam String drink) {
		if (amt <= 0) {
			return ResponseEntity.badRequest().body(new MessageResponse("Choose drink operation failed."));
		} else {
			Sale s = dServ.chooseDrink(amt, drink);
			return ResponseEntity.ok().body(s);
		}
	}

	@GetMapping("/drink-details")
	public ResponseEntity<?> getDrinkDetails() {
		List<Drink> drinks = dServ.findAll();
		DrinkDetails d = new DrinkDetails(drinks);
		return ResponseEntity.ok().body(d);
	}

}
