package plant.tamagochi.tamagochi.domain

import java.util.UUID

open class Plant private constructor(
    private val uuid: UUID,
    private val isRain: Boolean,
    private val moistureAir: Int,
    private val moistureSoil: Int,
    private val temperature: Byte
) {

    companion object {
        fun createPlant(plantDtoRegister: PlantDtoRegister): Plant {
            return Plant(
                UUID.fromString(plantDtoRegister.uuid),
                plantDtoRegister.isRain.toBoolean(),
                plantDtoRegister.moistureAir.toInt(),
                plantDtoRegister.moistureSoil.toInt(),
                plantDtoRegister.temperature.toByte()
            )
        }
    }


    fun getUUID(): UUID = this.uuid

    fun getIsRain(): Boolean = this.isRain

    fun getMoistureAir(): Int = this.moistureAir

    fun getMoistureSoil(): Int = this.moistureSoil

    fun getTemperature(): Byte = this.temperature

}