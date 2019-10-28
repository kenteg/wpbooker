package ru.raiffeisen.booking.config

import com.mchange.v2.c3p0.ComboPooledDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


@Configuration
class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource")
    fun getDataSource() = ComboPooledDataSource()


}