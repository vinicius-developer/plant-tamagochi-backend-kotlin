package plant.tamagochi.tamagochi.infrastructure.mysql.owner;

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OwnerPlantEntityRepository : CrudRepository<OwnerPlantEntity, Long> {

    fun findAllByIdOwner(id: Long): List<OwnerPlantEntity>

}