package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Refill;

public interface RefillRepository extends JpaRepository<Refill, Integer> {

	List<Refill> findByDate(LocalDate date);
	
}
