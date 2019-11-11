package ru.raiffeisen.booking.model.repository

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.stereotype.Repository
import ru.raiffeisen.booking.model.Status
import ru.raiffeisen.booking.model.WorkPlace
import javax.transaction.Transactional

@Repository
interface WorkPlaceRepository : CrudRepository<WorkPlace, Long> {
    fun findAllByFloor(floor: Int): List<WorkPlace>
    fun findAllByCode(code: String?): List<WorkPlace>

    @Modifying
    @Transactional
    @Query("update WorkPlace wp set wp.status = 'BOOKED' where wp.floor=:floor and wp.sector=:sector and wp.code=:code")
    fun bookPlaceByCode(floor: Int, sector: String, code: String)

    @Modifying
    @Transactional
    @Query("update WorkPlace wp set wp.status = 'FREE' where wp.floor=:floor and wp.sector=:sector and wp.code=:code")
    fun freePlaceByCode(floor: Int, sector: String, code: String)
}