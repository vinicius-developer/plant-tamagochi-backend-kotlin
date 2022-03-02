package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist

interface PlantOutput {

    fun savePlant(plant: PlantToPersist): PlantToPersist

}