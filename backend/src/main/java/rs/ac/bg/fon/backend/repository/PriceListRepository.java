package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.PriceList;

public interface PriceListRepository extends JpaRepository<PriceList, Long> {
}
