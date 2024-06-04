package etisalat.backend.usermanager.repository;

import etisalat.backend.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
	
}
