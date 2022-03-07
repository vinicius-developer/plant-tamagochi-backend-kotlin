package plant.tamagochi.tamagochi.owner.plants.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import plant.tamagochi.tamagochi.domain.plant.Plant
import java.util.*

internal class OwnerPlantBuilderTest {

    @Test
    fun testCreatePlantWithBuilder() {

        val builderPlant: OwnerPlantBuilder = OwnerPlantBuilder(
            UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"),
            23,
            false,
            105,
            89
        )

        val plant: Plant = builderPlant.plant

        assertEquals(plant.isRain, false)
        assertEquals(plant.temperature, 23)
        assertEquals(plant.moistureSoil, 89)
        assertEquals(plant.moistureAir, 105)
        assertEquals(plant.uuid.toString(), "a15ace80-8d20-11ec-b909-0242ac121015")

    }


}