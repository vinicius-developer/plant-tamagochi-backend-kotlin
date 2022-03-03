package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.domain.Plant

interface PlantStorage {

    fun storage(plant: Plant): Plant

}