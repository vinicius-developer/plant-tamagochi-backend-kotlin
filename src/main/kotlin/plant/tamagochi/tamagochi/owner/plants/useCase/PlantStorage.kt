package plant.tamagochi.tamagochi.owner.plants.useCase

import plant.tamagochi.tamagochi.owner.plants.domain.OwnerPlant

interface PlantStorage {

    fun getListOfPlants(): List<OwnerPlant>

}