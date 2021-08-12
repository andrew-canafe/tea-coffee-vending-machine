package cogent.tcvm.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import cogent.tcvm.model.Sale;
import cogent.tcvm.repository.SaleRepository;
import cogent.tcvm.service.SaleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleServiceTest {

	@MockBean
	private SaleRepository saleRepo;
	
	@Autowired
	private SaleService saleService;
	
	@Test
	public void totalSalesTest() {
		when(saleRepo.findAll()).thenReturn(Stream.of(new Sale(), new Sale(), new Sale(), 
				new Sale(), new Sale(), new Sale(), new Sale())
				.collect(Collectors.toList()));
		assertEquals(7, saleService.findAll().size());
	}
}
