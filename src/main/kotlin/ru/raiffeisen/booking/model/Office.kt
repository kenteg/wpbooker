package ru.raiffeisen.booking.model


import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*
@Entity
data class Office(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Int,
        val name: String?,
        val address: String?,
        @JsonBackReference
        @OneToMany(mappedBy = "office")
        val workplaces: List<WorkPlace>,
        val floorsCount: Short
)