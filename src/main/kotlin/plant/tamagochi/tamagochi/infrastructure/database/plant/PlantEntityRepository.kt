package plant.tamagochi.tamagochi.infrastructure.database.plant;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlantEntityRepository : JpaRepository<PlantEntity, Long> {}