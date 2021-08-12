package cogent.tcvm.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import cogent.tcvm.model.Container;
import cogent.tcvm.repository.ContainerRepository;
import cogent.tcvm.service.ContainerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContainerServiceTest {
	
	@Autowired
	private ContainerService cServ;
	
	@MockBean
	private ContainerRepository cRepo;

	@Test
	public void getContainerDetailsTest() {
		when(cRepo.findAll()).thenReturn(Stream.of(new Container(), new Container(), new Container(), new Container(), new Container()).collect(Collectors.toList()));
		assertEquals(5, cServ.getAllContainers().size());
	}
}
