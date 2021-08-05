package cogent.tcvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Container;
import cogent.tcvm.service.ContainerService;
import cogent.tcvm.wrapper.ContainerDetails;

@RestController
@RequestMapping("/api")
public class ContainerController {

	@Autowired
	ContainerService containerService;
	
	@GetMapping("/container-details")
	public ResponseEntity<?> getContainerDetails() {
		List<Container> containerList = containerService.getAllContainers();
		System.out.println(new ContainerDetails(containerList));
		
		return ResponseEntity.ok(new ContainerDetails(containerList));
	}
	
	@PostMapping("/container-details")
	public ResponseEntity<?> setContainerDetails(@RequestBody Container body) {
		containerService.setContainer(body);
		
		return null;
	}
}
