package plant.tamagochi.tamagochi.infrastructure.mysql.plant

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.plant.create.domain.PlantToPersist
import plant.tamagochi.tamagochi.plant.create.usecase.PlantStorage
import java.util.*

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