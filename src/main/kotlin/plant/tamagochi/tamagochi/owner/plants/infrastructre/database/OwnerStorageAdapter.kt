package plant.tamagochi.tamagochi.owner.plants.infrastructre.database

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.infrastructure.mysql.owner.OwnerPlantEntity
import plant.tamagochi.tamagochi.infrastructure.mysql.owner.OwnerPlantEntityRepository
import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import plant.tamagochi.tamagochi.owner.plants.useCase.OwnerStorage
import java.util.LinkedList
import java.util.UUID

@Service
class OwnerStorageAdapter(
    @Autowired private val ownerEntityRepository: OwnerPlantEntityRepository
) : OwnerStorage {

    override fun getListOfPlants(id: Long): List<Owner> {

        val listOwnerEntity: Iterable<OwnerPlantEntity> = this.ownerEntityRepository.findAllByIdOwner(id)

        return this.convertEntityToOwner(listOwnerEntity)

    }

    private fun convertEntityToOwner(listOwnerEntity: Iterable<OwnerPlantEntity>): List<Owner> {

        return listOwnerEntity.map { ownerEntity ->
            Owner(
                ownerEntity.idOwner,
                UUID.fromString(ownerEntity.uuidPlant)
            )
        }

    }

}