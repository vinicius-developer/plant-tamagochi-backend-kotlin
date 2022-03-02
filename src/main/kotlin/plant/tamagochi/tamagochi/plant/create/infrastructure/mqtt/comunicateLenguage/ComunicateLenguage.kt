package plant.tamagochi.tamagochi.plant.create.infrastructure.mqtt.comunicateLenguage

interface ComunicateLenguage {

    fun convert(message: String): Map<String, String>

}