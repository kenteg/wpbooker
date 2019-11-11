package ru.raiffeisen.booking.model.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.raiffeisen.booking.model.repository.WorkPlaceRepository
import java.io.Serializable

@RestController
class WorkPlaceController(
        val workPlaceRepository: WorkPlaceRepository
) {

    @PostMapping(value = ["/bookplace"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun bookPlace(@RequestBody req: BookPlaceReq){
        workPlaceRepository.bookPlaceByCode(req.floor.toInt(), req.sector, req.code)
    }

    @PostMapping(value = ["/freeplace"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun freePlace( @RequestBody req: BookPlaceReq){
        workPlaceRepository.freePlaceByCode(req.floor.toInt(), req.sector, req.code)
    }
}

data class BookPlaceReq (
        val floor: Long,
        val sector: String,
        val code: String
): Serializable