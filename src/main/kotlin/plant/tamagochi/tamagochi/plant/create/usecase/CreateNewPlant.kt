package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.plant.create.domain.PersistPlantBuilder

class CreateNewPlant {

    fun processInformation(
        input: PlantInput, output: PlantOutput
    ): Plant {

        val persistPlantBuilder: PersistPlantBuilder = input.getPersistPlantBuilder()

        return output.savePlant(persistPlantBuilder)

    }

}