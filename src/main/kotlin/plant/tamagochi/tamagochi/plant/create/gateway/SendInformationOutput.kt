package plant.tamagochi.tamagochi.plant.create.gateway

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist
import plant.tamagochi.tamagochi.plant.create.usecase.PlantOutput
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage

class SendInformationOutput(
    private val persistence: PlantStorage
): PlantOutput {

    override fun savePlant(plant: PlantToPersist): PlantToPersist {
        return persistence.storage(plant)
    }

}