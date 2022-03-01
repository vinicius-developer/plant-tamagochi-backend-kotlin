package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.Plant

interface PlantStorage {

    fun storage(plant: Plant): Unit

}