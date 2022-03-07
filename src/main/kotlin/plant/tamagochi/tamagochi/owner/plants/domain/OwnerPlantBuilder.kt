package plant.tamagochi.tamagochi.owner.plants.domain

import plant.tamagochi.tamagochi.domain.plant.BuilderPlant
import java.util.*

class OwnerPlantBuilder(
    uuid: UUID,
    temperature: Byte,
    isRain: Boolean,
    moistureAir: Int,
    moistureSoil: Int
): BuilderPlant(
    uuid,
    temperature,
    isRain,
    moistureAir,
    moistureSoil
)

