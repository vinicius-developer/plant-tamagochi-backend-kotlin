package plant.tamagochi.tamagochi.owner.plants.useCase

import org.junit.jupiter.api.Test
import plant.tamagochi.tamagochi.domain.plant.Plant
import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import java.util.*

internal class GetPlantsOwnerTest {

    @Test
    fun testGetPlants() {

        val id: Long = 1

        val ownerStorage: OwnerStorage = this.getMockOwnerStorage()

        val plantStorage: PlantStorage = this.getMockPlantStorage()

        val list: List<Plant> = GetPlantsOwner().getPlants(
            id,
            ownerStorage,
            plantStorage
        )

        val listForCompare = listOf<Plant>(
            Plant(UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"), 25, false, 85, 105),
        )

        assert(list == listForCompare)

    }

    private fun getMockPlantStorage(): PlantStorage {
        return object : PlantStorage {

            private val listOfPlants = listOf<Plant>(
                Plant(UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"), 25, false, 85, 105),
                Plant(UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121017"), 25, false, 85, 105),
                Plant(UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121018"), 25, false, 85, 105)
            )

            override fun getListOfPlants(uuids: List<UUID>): List<Plant> {

                val list = mutableListOf<Plant>()

                for (uuid in uuids) {

                    val plant: Plant? = this.getPlants(uuid)

                    if (plant !== null) {
                        list.add(plant)
                    }
                }

                return list

            }

            private fun getPlants(uuid: UUID): Plant? {

                for (plant in this.listOfPlants) {
                    if (plant.uuid == uuid) {
                        return plant
                    }
                }

                return null

            }

        }
    }

    private fun getMockOwnerStorage(): OwnerStorage {
        return object : OwnerStorage {

            override fun getListOfPlants(id: Long): List<Owner> {

                return listOf<Owner>(
                    Owner(
                        1,
                        UUID.fromString("a15ace80-8d20-11ec-b909-0242ac121015"),
                    )
                )

            }

        }
    }

}


