package plant.tamagochi.tamagochi.infrastructure.mqtt

import org.springframework.messaging.Message
import org.springframework.messaging.MessageHandler
import org.springframework.messaging.MessagingException

class ReceiveMqttMessages: MessageHandler {

    @Throws(MessagingException::class)
    override fun handleMessage(message: Message<*>) {
        println(message.payload.toString())
    }

}