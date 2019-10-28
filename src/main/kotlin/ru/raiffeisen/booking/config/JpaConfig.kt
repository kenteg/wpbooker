package ru.raiffeisen.booking.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EntityScan(basePackages = ["ru.raiffeisen.booking.model"])
@EnableJpaRepositories(basePackages = ["ru.raiffeisen"])
@EnableTransactionManagement
class JPAConfig