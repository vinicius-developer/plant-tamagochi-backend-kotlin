package plant.tamagochi.tamagochi.infrastructure.mysql.plant

import plant.tamagochi.tamagochi.domain.Plant
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import javax.persistence.*

@Entity
@Table(name = "plant")
open class PlantEntity() {

    @Id
    @Column(nullable = false)
    var uuid: String? = null
        private set

    @Column(name = "is_rain")
    private var isRain: Boolean? = null

    @Column(name = "moisture_air")
    private var moistureAir: Int? = null

    @Column(name = "moisture_soil")
    private var moistureSoil: Int? = null

    private var temperature: Byte? = null

    @Column(name = "created_at")
    private var createAt: String? = null

    constructor(plant: Plant) : this() {
        this.uuid = plant.uuid.toString()
        this.isRain = plant.isRain
        this.moistureAir = plant.moistureAir
        this.moistureSoil = plant.moistureSoil
        this.temperature = plant.temperature
        this.createAt = DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm:ss")
            .withZone(ZoneOffset.UTC)
            .format(Instant.now())
    }

}