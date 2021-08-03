package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Refills;

public interface RefillsRepository extends JpaRepository<Refills, Integer>{

	List<Refills> findByDate(LocalDate date);
	
}
