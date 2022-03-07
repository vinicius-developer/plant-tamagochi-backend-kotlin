package plant.tamagochi.tamagochi.domain.plant

import java.util.*

abstract class BuilderPlant(
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