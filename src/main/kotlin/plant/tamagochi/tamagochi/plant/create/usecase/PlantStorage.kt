package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.domain.plant.Plant

interface PlantStorage {

    fun storage(plant: Plant): Plant

}