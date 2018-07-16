package ZipTeamOrange.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:8100", "http://localhost:8080"})
public interface UserRepository extends JpaRepository<User, Long>{



}
