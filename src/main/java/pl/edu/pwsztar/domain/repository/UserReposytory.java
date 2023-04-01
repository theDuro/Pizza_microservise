package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.pwsztar.domain.enity.Bill;
import pl.edu.pwsztar.domain.enity.User;

public interface UserReposytory extends JpaRepository<User, Long>, CrudRepository<User, Long> {
}
