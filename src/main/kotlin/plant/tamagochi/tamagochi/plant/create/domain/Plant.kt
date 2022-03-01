package plant.tamagochi.tamagochi.plant.create.domain

import java.util.UUID

class Plant(
    val uuid: UUID,
    val temperature: Byte,
    val isRain: Boolean,
    val moistureAir: Int,
    val moistureSoil: Int,
) {

}