package plant.tamagochi.tamagochi.infrastructure.mqtt

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.integration.channel.DirectChannel
import org.springframework.integration.core.MessageProducer
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.MessageHandler
import plant.tamagochi.tamagochi.infrastructure.json.JsonMqttJacksonAdapter

@Configuration
class Mqtt {

    @Bean
    fun mqttInputChannel(): MessageChannel{
        return DirectChannel()
    }

    @Bean
    fun inbound(): MessageProducer {
        val adapter: MqttPahoMessageDrivenChannelAdapter = MqttPahoMessageDrivenChannelAdapter(
            "tcp://localhost:1883",
            "testClient",
            "teste/+/topico"
        )
        adapter.setCompletionTimeout(5000)
        adapter.setConverter(DefaultPahoMessageConverter())
        adapter.setQos(1)
        adapter.outputChannel = mqttInputChannel()
        return adapter
    }

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    fun handler(): MessageHandler {
        return ReceiveMqttMessagesAdapter()
    }

}