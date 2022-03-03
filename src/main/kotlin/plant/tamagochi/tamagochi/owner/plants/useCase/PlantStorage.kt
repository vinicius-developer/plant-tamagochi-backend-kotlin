package plant.tamagochi.tamagochi.owner.plants.useCase

import plant.tamagochi.tamagochi.domain.Plant

interface PlantStorage {

    fun getListOfPlants(): List<Plant>

}