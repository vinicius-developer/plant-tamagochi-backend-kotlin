package plant.tamagochi.tamagochi.port.database

import plant.tamagochi.tamagochi.domain.Plant

interface SavePlant {

    fun save(plant: Plant): Unit

}