package plant.tamagochi.tamagochi.plant.create.gateway

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class ReceiveInformationTest() {

    @Test
    fun testGetPlant() {

        val information: InformationInputDataProvider = InformationInputDataProvider(
            UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"),
            25,
            false,
            35,
            12
        )

        val plant = information.getPersistPlantBuilder().plant

        assertEquals(plant.isRain, false)
        assertEquals(plant.temperature, 25)
        assertEquals(plant.moistureSoil, 12)
        assertEquals(plant.moistureAir, 35)
        assertEquals(plant.uuid.toString(), "a15ace80-8d20-11ec-b909-0242ac121015")

    }


}