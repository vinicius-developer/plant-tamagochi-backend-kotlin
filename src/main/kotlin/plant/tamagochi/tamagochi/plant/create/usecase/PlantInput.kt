package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist

interface PlantInput {

    fun getPlant(): PlantToPersist

}