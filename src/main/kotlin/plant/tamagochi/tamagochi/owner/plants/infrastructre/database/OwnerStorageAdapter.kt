package plant.tamagochi.tamagochi.owner.plants.infrastructre.database

import org.springframework.beans.factory.annotation.Autowired
import plant.tamagochi.tamagochi.infrastructure.mysql.owner.OwnerEntity
import plant.tamagochi.tamagochi.infrastructure.mysql.owner.OwnerEntityRepository
import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import plant.tamagochi.tamagochi.owner.plants.useCase.OwnerStorage
import java.util.LinkedList
import java.util.UUID

class OwnerStorageAdapter(
    @Autowired private val ownerEntityRepository: OwnerEntityRepository
) : OwnerStorage {

    override fun getListOfPlants(id: Long): List<Owner> {

        val ids: ArrayList<Long> = ArrayList()

        ids.add(id)

        val listOwnerEntity: LinkedList<OwnerEntity> = this.ownerEntityRepository.findAllById(ids) as LinkedList

        return this.convertEntityToOwner(listOwnerEntity)


    }

    private fun convertEntityToOwner(listOwnerEntity: LinkedList<OwnerEntity>): List<Owner> {

        return listOwnerEntity.map { ownerEntity ->
            Owner(
                ownerEntity.owner ?: throw RuntimeException("Owner id is null"),
                UUID.fromString(ownerEntity.uuidPlant) ?: throw RuntimeException("uuid plant is null")
            )
        }

    }

}