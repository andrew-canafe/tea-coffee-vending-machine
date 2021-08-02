package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Containers;

public interface ContainerRepository extends JpaRepository<Containers, Integer>{

}
