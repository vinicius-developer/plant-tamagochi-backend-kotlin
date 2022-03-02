package plant.tamagochi.tamagochi.plant.create.domain

import plant.tamagochi.tamagochi.domain.Plant
import java.util.*

class PlantToPersist(
    uuid: UUID,
    temperature: Byte,
    isRain: Boolean,
    moistureAir: Int,
    moistureSoil: Int
): Plant(
    uuid,
    temperature,
    isRain,
    moistureAir,
    moistureSoil
)