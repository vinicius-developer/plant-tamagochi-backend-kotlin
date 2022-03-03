package plant.tamagochi.tamagochi.plant.create.infrastructure.mqtt

import com.fasterxml.jackson.databind.JsonMappingException
import org.springframework.beans.factory.annotation.Autowired
import plant.tamagochi.tamagochi.plant.create.gateway.InformationInputDataProvider
import plant.tamagochi.tamagochi.plant.create.gateway.SendInformationOutput
import plant.tamagochi.tamagochi.plant.create.usecase.CreateNewPlant
import plant.tamagochi.tamagochi.plant.create.usecase.PlantInput
import plant.tamagochi.tamagochi.plant.create.usecase.PlantOutput
import org.springframework.messaging.Message
import org.springframework.messaging.MessageHandler
import org.springframework.messaging.MessagingException
import org.springframework.stereotype.Service
import plant.tamagochi.tamagochi.plant.create.infrastructure.mysql.plant.PlantEntityAdapter
import plant.tamagochi.tamagochi.plant.create.infrastructure.mqtt.comunicateLenguage.json.ConverterJsonInMap
import java.util.*

@Service
class ReceiveMqttMessagesAdapter(): MessageHandler {

    @Autowired
    private lateinit var plantEntityAdapter: PlantEntityAdapter

    @Throws(MessagingException::class)
    override fun handleMessage(message: Message<*>) {

        val readableInformation: Map<String, String>
            = this.transformInPlantDtoRegister(message.payload.toString())
            ?: throw JsonMappingException("Json is invalid")

        val input: PlantInput = InformationInputDataProvider(
            UUID.fromString(readableInformation.getValue("uuid")),
            readableInformation.getValue("temperature").toByte(),
            readableInformation.getValue("isRain").toBoolean(),
            readableInformation.getValue("moistureAir").toInt(),
            readableInformation.getValue("moistureSoil").toInt()
        )

        val output: PlantOutput = SendInformationOutput(
            this.plantEntityAdapter
        )

        CreateNewPlant().processInformation(input, output)

    }

    private fun transformInPlantDtoRegister(message: String): Map<String, String>? {
        var plantDtoRegister: Map<String, String>? = null

        try {
            plantDtoRegister = ConverterJsonInMap().convert(message)
        } catch (e: Throwable) {
            e.printStackTrace()
        }

        return plantDtoRegister
    }

}