package plant.tamagochi.tamagochi.infrastructure.mysql.owner

import plant.tamagochi.tamagochi.owner.plants.domain.Owner
import javax.persistence.*

@Entity
@Table(name = "plant")
open class OwnerEntity() {

    @Id
    @GeneratedValue
    private var id: Long? = null

    @Column(name = "uuid_plant")
    var uuidPlant: String? = null
        private set

    var owner: Long? = null
        private set


    constructor(owner: Owner) : this() {
        this.owner = owner.id
        this.uuidPlant = owner.uuidPlant.toString()
    }

}