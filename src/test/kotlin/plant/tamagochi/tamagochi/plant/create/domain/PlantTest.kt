package plant.tamagochi.tamagochi.plant.create.domain

import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class PlantTest {

    fun testCreatePlant() {

        val plant: Plant = Plant(
            UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"),
            25,
            false,
            35,
            12
        );

        assertEquals(plant.isRain, false)
        assertEquals(plant.temperature, 25)
        assertEquals(plant.moistureSoil, 35)
        assertEquals(plant.moistureAir, 12)
        assertEquals(plant.uuid, "a15ace80-8d20-11ec-b909-0242ac121015")

    }

}