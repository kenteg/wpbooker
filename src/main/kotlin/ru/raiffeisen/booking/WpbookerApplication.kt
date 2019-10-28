package ru.raiffeisen.booking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ru.raiffeisen.booking.model.repository.WorkPlaceRepository

@SpringBootApplication(scanBasePackages = ["ru.raiffeisen"])
class WpbookerApplication

fun main(args: Array<String>) {
    runApplication<WpbookerApplication>(*args)

}
