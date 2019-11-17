package com.dassuncao.spring.data.dynamodb.sample.repository

import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntity
import com.dassuncao.spring.data.dynamodb.sample.entity.UserEntityId
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserEntity, UserEntityId>