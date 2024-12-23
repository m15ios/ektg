package e_katalog.com.ru.ektg2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import e_katalog.com.ru.ektg2.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    
}
