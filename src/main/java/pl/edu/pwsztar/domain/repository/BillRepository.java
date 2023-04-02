package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.enity.Bill;
@Service
public interface BillRepository extends JpaRepository<Bill, Long>, CrudRepository<Bill, Long> {
}
