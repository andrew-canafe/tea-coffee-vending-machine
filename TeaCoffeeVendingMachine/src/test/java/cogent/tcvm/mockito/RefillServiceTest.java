package cogent.tcvm.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import cogent.tcvm.model.Refill;
import cogent.tcvm.repository.RefillRepository;
import cogent.tcvm.service.RefillService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RefillServiceTest {

	@MockBean
	private RefillRepository refillRepo;
	
	@Autowired
	private RefillService refillService;
	
	@Test
	public void getRefillsTest() {
		when(refillRepo.findAll()).thenReturn(new ArrayList<Refill>());
		assertEquals(0, refillService.getAllRefills().size());
	}
	
}
