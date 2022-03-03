package plant.tamagochi.tamagochi.plant.create.domain

import plant.tamagochi.tamagochi.domain.Plant
import java.util.*

class PersistPlantBuilder(
    uuid: UUID,
    temperature: Byte,
    isRain: Boolean,
    moistureAir: Int,
    moistureSoil: Int
) {

    val plant: Plant = Plant(
        uuid,
        temperature,
        isRain,
        moistureAir,
        moistureSoil
    )

}


