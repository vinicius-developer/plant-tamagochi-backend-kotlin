package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.domain.plant.Plant
import plant.tamagochi.tamagochi.plant.create.domain.PersistPlantBuilder

interface PlantOutput {

    fun savePlant(persistPlantBuilder: PersistPlantBuilder): Plant

}