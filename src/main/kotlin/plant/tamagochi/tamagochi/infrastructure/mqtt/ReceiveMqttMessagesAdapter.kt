package plant.tamagochi.tamagochi.infrastructure.mqtt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.Message
import org.springframework.messaging.MessageHandler
import org.springframework.messaging.MessagingException
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.domain.Plant
import plant.tamagochi.tamagochi.domain.PlantDtoRegister
import plant.tamagochi.tamagochi.exceptions.runtime.json.InvalidJsonRuntime
import plant.tamagochi.tamagochi.infrastructure.database.plant.PlantEntityAdapter
import plant.tamagochi.tamagochi.infrastructure.json.JsonMqttJacksonAdapter
import plant.tamagochi.tamagochi.useCase.crudPlant.CrudPlant

@Service
class ReceiveMqttMessagesAdapter(): MessageHandler {

    @Autowired
    private lateinit var plantEntityAdapter: PlantEntityAdapter

    @Throws(MessagingException::class)
    override fun handleMessage(message: Message<*>) {

        val plantDtoRegister: PlantDtoRegister = this.transformInPlantDtoRegister(message.payload.toString())
            ?: throw InvalidJsonRuntime("Json is invalid");

        CrudPlant().createRegister(this.plantEntityAdapter, plantDtoRegister)

    }

    private fun transformInPlantDtoRegister(message: String): PlantDtoRegister? {
        var plantDtoRegister: PlantDtoRegister? = null

        try {
            plantDtoRegister = JsonMqttJacksonAdapter().convert(message)
        } catch (e: Throwable) {
            e.printStackTrace()
        }

        return plantDtoRegister
    }

}