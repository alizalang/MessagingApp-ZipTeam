import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

interface MessageRespository extends JpaRepository<User, Integer> {

    List<User> findByTitleContainingOrContentContaining(String text, String textAgain);
}
