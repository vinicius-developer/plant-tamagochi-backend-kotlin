package plant.tamagochi.tamagochi.plant.create.infrastructure.mysql;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlantEntityRepository : JpaRepository<PlantEntity, Long> {}