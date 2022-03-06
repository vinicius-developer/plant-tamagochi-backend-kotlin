package plant.tamagochi.tamagochi.infrastructure.mysql.owner

import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "owner_plant")
open class OwnerPlantEntity private constructor(
    @Column(name = "uuid_plant", nullable = false)
    val uuidPlant: String,
    @Column(name = "id_owner", nullable = false)
    val idOwner: Long
) : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    constructor(owner: Owner) : this(
        owner.uuidPlant.toString(), owner.id
    )

}