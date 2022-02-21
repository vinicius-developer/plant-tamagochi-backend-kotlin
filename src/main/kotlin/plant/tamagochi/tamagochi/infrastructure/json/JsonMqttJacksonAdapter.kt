package plant.tamagochi.tamagochi.infrastructure.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import plant.tamagochi.tamagochi.port.mqtt.JsonMqttPort
import plant.tamagochi.tamagochi.domain.PlantDtoRegister

class JsonMqttJacksonAdapter: JsonMqttPort {

    private val mapper = ObjectMapper().registerKotlinModule()

    override fun convert(message: String): PlantDtoRegister {

        return this.mapper.readValue(
            message.trimIndent(),
            PlantDtoRegister::class.java
        )

    }

}