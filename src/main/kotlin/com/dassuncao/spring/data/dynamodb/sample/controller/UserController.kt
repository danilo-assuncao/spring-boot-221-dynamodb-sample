package com.dassuncao.spring.data.dynamodb.sample.controller

import com.dassuncao.spring.data.dynamodb.sample.repository.UserRepository
import com.dassuncao.spring.data.dynamodb.sample.utils.UserEntityGenerator
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {

    @PostMapping("/user")
    fun saveRandomUser() = userRepository.save(UserEntityGenerator.getRandomUser())
}