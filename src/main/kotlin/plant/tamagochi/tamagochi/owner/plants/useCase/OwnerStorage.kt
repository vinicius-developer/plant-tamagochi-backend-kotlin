package plant.tamagochi.tamagochi.owner.plants.useCase

import plant.tamagochi.tamagochi.owner.plants.domain.Owner

interface OwnerStorage {

    fun getListOfPlants(): List<Owner>

}