package API.Server.repository;


import API.Server.entity.cats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<cats, Long> {
}
