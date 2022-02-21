package plant.tamagochi.tamagochi.port.mqtt

import plant.tamagochi.tamagochi.domain.PlantDtoRegister

interface JsonMqttPort {

    fun convert(message: String): PlantDtoRegister

}