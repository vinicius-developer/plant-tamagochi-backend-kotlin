package plant.tamagochi.tamagochi.plant.create.usecase

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist
import plant.tamagochi.tamagochi.plant.create.gateway.ReceiveInformation
import java.util.*

internal class CreateNewPlantTest {

    @Test
    fun testsCreateNewPlant() {

        val input: PlantInput = ReceiveInformation(
            UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"),
            25,
            false,
            35,
            12
        )

        val output: PlantOutput = object : PlantOutput {
            override fun savePlant(plant: PlantToPersist): PlantToPersist {
                return plant
            }
        }

        val plant: PlantToPersist = CreateNewPlant().processInformation(input, output)

        assertEquals(plant.isRain, false)
        assertEquals(plant.temperature, 25)
        assertEquals(plant.moistureSoil, 12)
        assertEquals(plant.moistureAir, 35)
        assertEquals(plant.uuid.toString(), "a15ace80-8d20-11ec-b909-0242ac121015")

    }

}