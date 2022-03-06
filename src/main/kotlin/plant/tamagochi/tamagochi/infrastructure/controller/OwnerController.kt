package plant.tamagochi.tamagochi.infrastructure.controller

import org.intellij.lang.annotations.RegExp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.owner.plants.infrastructre.database.OwnerStorageAdapter
import plant.tamagochi.tamagochi.owner.plants.infrastructre.database.PlantStorageAdapter
import plant.tamagochi.tamagochi.owner.plants.useCase.GetPlantsOwner

@Controller
@RequestMapping("/owner")
class OwnerController(
    @Autowired private val ownerStorageAdapter: OwnerStorageAdapter,
    @Autowired private val plantStorageAdapter: PlantStorageAdapter
) {

    @GetMapping("/plants/{idOwner}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun getPlantByOwner(@PathVariable @RegExp(prefix = "/[0-9]/") idOwner: String): List<Plant> {

        val idOwnerNumber: Long = idOwner.toLong()

        return GetPlantsOwner().getPlants(
            idOwnerNumber,
            this.ownerStorageAdapter,
            this.plantStorageAdapter
        )
    }
}