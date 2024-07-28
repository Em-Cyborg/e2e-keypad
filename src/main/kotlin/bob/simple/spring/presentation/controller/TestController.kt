package bob.simple.spring.presentation.controller

import bob.simple.spring.data.repository.CarRepository
import bob.simple.spring.domain.service.CarService
import bob.simple.spring.presentation.dto.CarResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class TestController(
    private val carService: CarService,
    private val carRepositoryList: List<CarRepository>,
    private val carJdbcTemplate: CarRepository,
    private val carRedisRepository: CarRepository,
    ) {
    @GetMapping("/{id}")
    fun getCar(
        @PathVariable("id") id: String
    ): CarResponseDto {
        return carService.getCar(id)
    }
}