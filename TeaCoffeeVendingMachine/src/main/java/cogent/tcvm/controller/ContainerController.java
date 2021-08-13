package cogent.tcvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tcvm.model.Container;
import cogent.tcvm.payload.response.MessageResponse;
import cogent.tcvm.service.ContainerService;
import cogent.tcvm.wrapper.ContainerDetails;
import cogent.tcvm.wrapper.ContainerRow;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class ContainerController {

	@Autowired
	ContainerService containerService;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/container-details")
	public ResponseEntity<?> getContainerDetails() {
		List<Container> containerList = containerService.getAllContainers();

		return ResponseEntity.ok().body(new ContainerDetails(containerList));
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/container-details")
	public ResponseEntity<?> setContainerDetails(@RequestBody ContainerDetails containerDetails) {
		List<ContainerRow> containerRowList = containerDetails.getContainerRowList();

		boolean failed = false;

		if (containerRowList == null) {
			failed = true;
		} else {
			for (ContainerRow containerRow : containerRowList) {
				Container container = containerService.getContainerByIngredientName(containerRow.getName());

				if (container == null) {
					failed = true;
					break;
				}

				float fill = containerRow.getFill();
				float availableNew = container.getAvailable() + fill;

				if (container.getMaxCapacity() > availableNew && fill > 0 && availableNew > 0) {
					containerService.setContainer(container, fill, availableNew);
				} /*else {
					failed = true;
					break;
				}*/
			}
		}

		if (failed) {
			return ResponseEntity.badRequest().body(new MessageResponse("Refill operation failed."));
		}

		return ResponseEntity.ok().body(new MessageResponse("Refill operation succeeded."));
	}

}
