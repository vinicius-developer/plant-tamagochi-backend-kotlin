package plant.tamagochi.tamagochi.infrastructure.mqtt.comunicateLenguage.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.type.MapType
import com.fasterxml.jackson.databind.type.TypeFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import plant.tamagochi.tamagochi.infrastructure.mqtt.comunicateLenguage.ComunicateLenguage

class ConverterJsonInMap: ComunicateLenguage {

    private val mapper = ObjectMapper().registerKotlinModule()

    override fun convert(message: String): Map<String, String> {

        return this.mapper.readValue(
            message.trimIndent(),
            this.buildValueToReturn()
        )

    }

    private fun buildValueToReturn(): MapType {

        val factory: TypeFactory = TypeFactory.defaultInstance()

        return factory.constructMapType(
            HashMap::class.java,
            String::class.java,
            String::class.java
        )

    }

}