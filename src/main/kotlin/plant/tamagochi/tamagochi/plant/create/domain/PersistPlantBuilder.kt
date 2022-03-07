package plant.tamagochi.tamagochi.plant.create.domain

import plant.tamagochi.tamagochi.domain.plant.BuilderPlant
import java.util.*

class PersistPlantBuilder(
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


