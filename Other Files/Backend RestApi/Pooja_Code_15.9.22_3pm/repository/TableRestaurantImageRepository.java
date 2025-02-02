package project.repository;

import project.entity.TableRestaurantImageEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRestaurantImageRepository extends JpaRepository<TableRestaurantImageEntity,Long>
{
    Optional<TableRestaurantImageEntity> findByName(String fileName);
}
