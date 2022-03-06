package plant.tamagochi.tamagochi.owner.plants.useCase

import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import java.util.*

class GetPlantsOwner {

    fun getPlants(
        idOwner: Long,
        ownerStorage: OwnerStorage,
        plantStorage: PlantStorage
    ): List<Plant> {

        val listOwnerAndUUIDPlant: List<Owner> = ownerStorage.getListOfPlants(idOwner)

        val listUUIDPlant: List<UUID> = this.filterUUID(listOwnerAndUUIDPlant)

        return plantStorage.getListOfPlants(listUUIDPlant)

    }

    private fun filterUUID(listOwnerAndUUIDPlant: List<Owner>): List<UUID> {
        return listOwnerAndUUIDPlant.map { owner: Owner ->
            owner.uuidPlant
        }
    }

}