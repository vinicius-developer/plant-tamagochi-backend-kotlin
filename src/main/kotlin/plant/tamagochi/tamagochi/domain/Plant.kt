package plant.tamagochi.tamagochi.domain

import java.util.UUID

open class Plant constructor(
    private val uuid: UUID,
    private val isRain: Boolean,
    private val moistureAir: Int,
    private val moistureSoil: Int,
    private val temperature: Byte
) {



}