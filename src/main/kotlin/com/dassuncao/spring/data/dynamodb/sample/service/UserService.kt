package com.dassuncao.spring.data.dynamodb.sample.service

import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntity
import com.dassuncao.spring.data.dynamodb.sample.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun save(user: UserEntity) = userRepository.save(user)
}