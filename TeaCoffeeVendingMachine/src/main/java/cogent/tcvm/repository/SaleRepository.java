package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.tcvm.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

	public List<Sale> findByDate(LocalDate today);

}
