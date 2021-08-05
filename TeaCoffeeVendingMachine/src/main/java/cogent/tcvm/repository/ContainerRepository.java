package cogent.tcvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.tcvm.model.Container;
public interface ContainerRepository extends JpaRepository<Container, Integer> {

}
