package cogent.tcvm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.tcvm.model.Refill;

@Repository
public interface RefillRepository extends JpaRepository<Refill, Integer> {

	List<Refill> findByDate(LocalDate date);

}
