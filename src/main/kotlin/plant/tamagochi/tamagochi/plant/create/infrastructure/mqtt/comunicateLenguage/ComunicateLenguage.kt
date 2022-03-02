package plant.tamagochi.tamagochi.infrastructure.mqtt.comunicateLenguage

interface ComunicateLenguage {

    fun convert(message: String): Map<String, String>

}