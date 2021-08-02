package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
