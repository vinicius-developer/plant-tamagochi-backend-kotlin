package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.Plant

class CreateNewPlant {

    fun processInformation(
        input: PlantInput, output: PlantOutput
    ) {

        val plant: Plant = input.getPlant()

        output.savePlant(plant)

    }

}