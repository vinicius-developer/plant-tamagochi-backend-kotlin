package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.Plant

interface PlantInput {

    fun getPlant(): Plant

}