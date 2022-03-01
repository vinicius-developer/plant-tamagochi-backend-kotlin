package plant.tamagochi.tamagochi.plant.create.gateway

import plant.tamagochi.tamagochi.plant.create.domain.Plant
import plant.tamagochi.tamagochi.plant.create.usecase.PlantOutput
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage

class SendInformationOutput(
    val persistence: PlantStorage
): PlantOutput {

    override fun savePlant(plant: Plant) {
        persistence.storage(plant)
    }

}