package ru.raiffeisen.booking.model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*
@Entity
data class WorkPlace(

        @Id
        @SequenceGenerator(name = "WORKPLACE_ID_GENERATOR", sequenceName = "SEQ_WORKPLACE", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int? = null,
        val code: String? = null,
        val floor: Int? = null,
        val sector: String? = null,
        @Enumerated(EnumType.STRING)
        val status: Status? = null,
        val holderLogin: String? = null,

        @JsonManagedReference
        @ManyToOne(cascade = [CascadeType.ALL])
        val office: Office? = null

)