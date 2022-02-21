package plant.tamagochi.tamagochi.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class PlantDtoRegister(
    @JsonProperty("uuid")  val uuid: String ,
    @JsonProperty("isRain") val isRain: String,
    @JsonProperty("moistureAir") val moistureAir: String,
    @JsonProperty("moistureSoil") val moistureSoil: String,
    @JsonProperty("temperature") val temperature: String
)