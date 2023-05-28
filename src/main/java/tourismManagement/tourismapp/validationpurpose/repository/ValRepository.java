package tourismManagement.tourismapp.validationpurpose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourismManagement.tourismapp.validationpurpose.entity.ValEntity;

import java.util.Date;

public interface ValRepository extends JpaRepository<ValEntity, Date> {
}
