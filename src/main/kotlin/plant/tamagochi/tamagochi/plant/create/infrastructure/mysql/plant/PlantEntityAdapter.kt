package plant.tamagochi.tamagochi.plant.create.infrastructure.mysql.plant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.infrastructure.mysql.plant.PlantEntity
import plant.tamagochi.tamagochi.infrastructure.mysql.plant.PlantEntityRepository
import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage

@Service
class PlantEntityAdapter(): PlantStorage {

    @Autowired
    private lateinit var plantEntityRepository: PlantEntityRepository

    override fun storage(plant: PlantToPersist): PlantToPersist {

        val entity: PlantEntity = PlantEntity(plant)

        this.plantEntityRepository.save(entity)

        return plant

    }

}