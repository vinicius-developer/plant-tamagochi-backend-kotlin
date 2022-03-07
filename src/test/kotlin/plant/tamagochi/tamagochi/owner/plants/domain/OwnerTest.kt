package plant.tamagochi.tamagochi.owner.plants.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class OwnerTest {

    @Test
    fun testCreateOwner() {

        val owner = Owner(
            1,
            UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015")
        )

        assertEquals(1, owner.id)
        assertEquals("a15ace80-8d20-11ec-b909-0242ac121015", owner.uuidPlant.toString())

    }

}