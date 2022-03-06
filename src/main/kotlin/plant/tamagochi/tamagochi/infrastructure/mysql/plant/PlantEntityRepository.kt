package plant.tamagochi.tamagochi.infrastructure.mysql.plant;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import plant.tamagochi.tamagochi.infrastructure.mysql.plant.PlantEntity

@Repository
interface PlantEntityRepository : CrudRepository<PlantEntity, String>