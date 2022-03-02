package plant.tamagochi.tamagochi.owner.plants.domain

import plant.tamagochi.tamagochi.domain.Plant
import java.util.*

class OwnerPlant(
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