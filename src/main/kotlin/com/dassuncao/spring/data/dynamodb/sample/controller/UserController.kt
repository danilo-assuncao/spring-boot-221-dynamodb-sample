package com.dassuncao.spring.data.dynamodb.sample.controller

import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntity
import com.dassuncao.spring.data.dynamodb.sample.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @PostMapping("/user")
    fun save(@RequestBody user: UserEntity) = userService.save(user)
}