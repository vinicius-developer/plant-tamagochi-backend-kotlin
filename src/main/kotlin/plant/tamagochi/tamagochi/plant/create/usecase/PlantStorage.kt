package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist

interface PlantStorage {

    fun storage(plant: PlantToPersist): PlantToPersist

}