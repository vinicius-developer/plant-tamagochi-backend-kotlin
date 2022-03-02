package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist

class CreateNewPlant {

    fun processInformation(
        input: PlantInput, output: PlantOutput
    ):PlantToPersist {

        val plant: PlantToPersist = input.getPlant()

        return output.savePlant(plant)

    }

}