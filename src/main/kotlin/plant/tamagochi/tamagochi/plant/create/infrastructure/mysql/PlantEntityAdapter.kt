package plant.tamagochi.tamagochi.plant.create.infrastructure.mysql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.plant.create.domain.Plant
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage

@Service
class PlantEntityAdapter(): PlantStorage {

    @Autowired
    private lateinit var plantEntityRepository: PlantEntityRepository

    override fun storage(plant: Plant): Unit {

        val entity: PlantEntity = PlantEntity(plant)

        this.plantEntityRepository.save(entity)

    }

}