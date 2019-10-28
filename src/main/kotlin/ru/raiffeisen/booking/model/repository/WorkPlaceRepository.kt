package ru.raiffeisen.booking.model.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ru.raiffeisen.booking.model.WorkPlace

@Repository
interface WorkPlaceRepository : CrudRepository<WorkPlace, Int> {
    fun findAllByFloor(floor: Int?): List<WorkPlace>

    fun findAllByCode(code: String?): List<WorkPlace>
}