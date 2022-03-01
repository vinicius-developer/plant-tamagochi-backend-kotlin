package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.Plant

interface PlantOutput {

    fun savePlant(plant: Plant)

}