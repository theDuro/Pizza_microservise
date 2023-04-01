package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.pwsztar.domain.enity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long>, CrudRepository<Bill, Long> {
}
