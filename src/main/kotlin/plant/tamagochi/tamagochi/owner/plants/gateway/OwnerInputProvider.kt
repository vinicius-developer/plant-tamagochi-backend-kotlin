package plant.tamagochi.tamagochi.owner.plants.gateway

import plant.tamagochi.tamagochi.owner.plants.useCase.OwnerInput

class OwnerInputProvider(private val id: Long): OwnerInput {

    override fun getOwnerInput(): Long {
        return this.id
    }

}