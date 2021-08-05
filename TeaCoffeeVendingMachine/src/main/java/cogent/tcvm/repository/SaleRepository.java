package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cogent.tcvm.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
	@Query("SELECT SUM(NUMBER_OF_CUPS) FROM SALE")
	public int getTotalCups();
	
	@Query("SELECT SUM(NUMBER_OF_CUPS) FROM SALE s WHERE s.DRINK_ID =: DRINK_ID")
	public int getTotalCupsForADrink(int id);
	
}
