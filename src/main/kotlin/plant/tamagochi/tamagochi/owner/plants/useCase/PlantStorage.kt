package plant.tamagochi.tamagochi.owner.plants.useCase

import plant.tamagochi.tamagochi.domain.Plant
import java.util.*

interface PlantStorage {

    fun getListOfPlants(uuids: List<UUID>): List<Plant>

}