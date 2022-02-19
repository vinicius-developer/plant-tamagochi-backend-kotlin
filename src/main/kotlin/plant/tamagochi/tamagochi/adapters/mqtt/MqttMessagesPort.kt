package plant.tamagochi.tamagochi.adapters.mqtt

interface MqttMessagesPort {

    fun save(message: String): Unit;

}