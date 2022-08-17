package kg.megacom.library.domains;

import kg.megacom.library.models.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepo extends JpaRepository<Reader,Long> {
}
