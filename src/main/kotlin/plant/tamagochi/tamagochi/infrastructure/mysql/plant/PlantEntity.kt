package plant.tamagochi.tamagochi.infrastructure.mysql.plant

import plant.tamagochi.tamagochi.domain.plant.Plant
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import javax.persistence.*

@Entity
@Table(name = "plant")
open class PlantEntity private constructor(
    @Id
    @Column(nullable = false)
    val uuid: String,
    @Column(name = "is_rain")
    val isRain: Boolean,
    val temperature: Byte,
    @Column(name = "moisture_air")
    val moistureAir: Int,
    @Column(name = "moisture_soil")
    val moistureSoil: Int
) {

    @Column(name = "created_at")
    private var createAt: String = this.getTimestamp()

    constructor(plant: Plant) : this(
        plant.uuid.toString(),
        plant.isRain,
        plant.temperature,
        plant.moistureAir,
        plant.moistureSoil
    ) {
        this.createAt = this.getTimestamp()
    }

    private fun getTimestamp(): String {
        return DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm:ss")
            .withZone(ZoneOffset.UTC)
            .format(Instant.now())
    }

}