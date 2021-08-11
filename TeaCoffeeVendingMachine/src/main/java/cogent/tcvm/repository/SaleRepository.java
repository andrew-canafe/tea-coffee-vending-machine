package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cogent.tcvm.model.Drink;
import cogent.tcvm.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

	public List<Sale> findByDate(LocalDate today);


	
}
