package plant.tamagochi.tamagochi.owner.plants.domain

import plant.tamagochi.tamagochi.domain.Plant
import java.util.*

class OwnerPlantBuilder(
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