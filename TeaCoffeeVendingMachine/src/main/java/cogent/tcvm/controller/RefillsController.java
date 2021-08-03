package cogent.tcvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.service.RefillsService;

@RestController
@RequestMapping("/api")
public class RefillsController {

	@Autowired
	RefillsService refsServ;
	
}
