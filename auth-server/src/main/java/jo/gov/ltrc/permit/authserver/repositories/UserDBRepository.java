package jo.gov.ltrc.permit.authserver.repositories;

import jo.gov.ltrc.permit.authserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDBRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
