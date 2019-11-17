package com.dassuncao.spring.data.dynamodb.sample.utils

import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntity
import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntityId

class UserEntityGenerator {

    companion object {

        fun getRandomUser() = UserEntity(
                id = UserEntityId(cpf = "12345678901", rg = "123456789"),
                name = "Jeremias",
                lastName = "Saimerej")
    }
}