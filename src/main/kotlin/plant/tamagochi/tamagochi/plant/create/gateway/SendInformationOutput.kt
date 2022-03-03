package plant.tamagochi.tamagochi.plant.create.gateway

import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.plant.create.domain.PersistPlantBuilder
import plant.tamagochi.tamagochi.plant.create.usecase.PlantOutput
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage

class SendInformationOutput(
    private val persistence: PlantStorage
): PlantOutput {

    override fun savePlant(persistPlantBuilder: PersistPlantBuilder): Plant {
        return persistence.storage(persistPlantBuilder.plant)
    }

}