package cogent.tcvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.service.ContainersService;
import cogent.tcvm.service.RefillsService;

@RestController
public class TestController {

	@Autowired
	private RefillsService refsServ;
	
	@Autowired
	private ContainersService consServ;
	
	@GetMapping("/refs")
	public void refsTest() {
		System.out.println(refsServ.getAllDays());
		System.out.println(refsServ.getToday());
	}
	
	@GetMapping("/cons")
	public void consTest() {
		System.out.println(consServ.getMaxCapacity());
		System.out.println(consServ.getAvailable());
	}
}
