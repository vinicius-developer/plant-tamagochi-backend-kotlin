package plant.tamagochi.tamagochi.infrastructure.database.plant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.port.database.SavePlant

@Service
class PlantEntityAdapter (): SavePlant {

    @Autowired
    private lateinit var plantEntityRepository: PlantEntityRepository

    override fun save(plant: Plant): Unit {

        val entity: PlantEntity = PlantEntity(plant)

        this.plantEntityRepository.save(entity)

    }

}