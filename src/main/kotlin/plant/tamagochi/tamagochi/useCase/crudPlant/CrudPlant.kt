package plant.tamagochi.tamagochi.useCase.crudPlant

import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.domain.PlantDtoRegister
import plant.tamagochi.tamagochi.port.database.SavePlant

class CrudPlant {

    fun createRegister(storage: SavePlant, plantDto: PlantDtoRegister): Unit {

        val plant: Plant = Plant.createPlant(plantDto)

        storage.save(plant)

    }

}