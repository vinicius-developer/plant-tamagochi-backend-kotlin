package plant.tamagochi.tamagochi.domain.plant

import java.util.UUID

data class Plant(
    val uuid: UUID,
    val temperature: Byte,
    val isRain: Boolean,
    val moistureAir: Int,
    val moistureSoil: Int,
)