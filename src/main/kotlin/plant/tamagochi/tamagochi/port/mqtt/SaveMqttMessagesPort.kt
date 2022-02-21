package plant.tamagochi.tamagochi.port.mqtt

import plant.tamagochi.tamagochi.domain.PlantDtoRegister

interface SaveMqttMessagesPort {

    fun save(message: PlantDtoRegister): Unit;

}