package plant.tamagochi.tamagochi.owner.plants.infrastructre.database

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.domain.plant.Plant
import plant.tamagochi.tamagochi.infrastructure.mysql.plant.PlantEntity
import plant.tamagochi.tamagochi.infrastructure.mysql.plant.PlantEntityRepository
import plant.tamagochi.tamagochi.owner.plants.domain.OwnerPlantBuilder
import plant.tamagochi.tamagochi.owner.plants.useCase.PlantStorage
import java.util.*

@Service
class PlantStorageAdapter(
    @Autowired private val plantEntityRepository: PlantEntityRepository
): PlantStorage {

    override fun getListOfPlants(uuids: List<UUID>): List<Plant> {

        val listOfString: List<String> = this.convertUuidToList(uuids)

        val listPlantEntity: Iterable<PlantEntity> = this.plantEntityRepository.findAllById(listOfString)

        return this.convertEntityInPlant(listPlantEntity)

    }

    private fun convertEntityInPlant(listPlantEntity: Iterable<PlantEntity>): List<Plant> {

       return listPlantEntity.map { plantEntity: PlantEntity ->
            OwnerPlantBuilder(
                UUID.fromString(plantEntity.uuid),
                plantEntity.temperature,
                plantEntity.isRain,
                plantEntity.moistureAir,
                plantEntity.moistureSoil
            ).plant
        }

    }

    private fun convertUuidToList(uuids: List<UUID>): List<String> {
        return uuids.map { uuid: UUID -> uuid.toString() }
    }

}