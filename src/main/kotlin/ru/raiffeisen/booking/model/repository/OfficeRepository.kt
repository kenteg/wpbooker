package ru.raiffeisen.booking.model.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ru.raiffeisen.booking.model.Office
import ru.raiffeisen.booking.model.WorkPlace
import java.util.*

@Repository
interface OfficeRepository : CrudRepository<Office, Int> {
    fun findByName(name: String?): Optional<Office>
}