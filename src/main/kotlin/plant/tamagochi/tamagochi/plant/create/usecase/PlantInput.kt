package plant.tamagochi.tamagochi.plant.create.usecase

import plant.tamagochi.tamagochi.plant.create.domain.PersistPlantBuilder

interface PlantInput {

    fun getPersistPlantBuilder(): PersistPlantBuilder

}