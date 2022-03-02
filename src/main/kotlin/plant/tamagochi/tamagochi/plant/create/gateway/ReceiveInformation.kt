package plant.tamagochi.tamagochi.plant.create.gateway

import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist
import plant.tamagochi.tamagochi.plant.create.usecase.PlantInput
import java.util.*

class ReceiveInformation(
    private val uuid: UUID,
    private val temperature: Byte,
    private val isRain: Boolean,
    private val moistureAir: Int,
    private val moistureSoil: Int
): PlantInput {

    override fun getPlant(): PlantToPersist {
        return PlantToPersist(
            this.uuid,
            this.temperature,
            this.isRain,
            this.moistureAir,
            this.moistureSoil
        )
    }

}