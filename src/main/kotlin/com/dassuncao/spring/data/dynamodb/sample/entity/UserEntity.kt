package com.dassuncao.spring.data.dynamodb.sample.entity

import com.amazonaws.services.dynamodbv2.datamodeling.*
import org.springframework.data.annotation.Id
import javax.validation.constraints.NotNull

@DynamoDBTable(tableName = "User")
data class UserEntity(

        @Id
        @DynamoDBIgnore
        val id: UserEntityId = UserEntityId(),

        @DynamoDBAttribute
        val name: String,

        @DynamoDBAttribute
        val lastName: String,

        @DynamoDBHashKey(attributeName = "cpf")
        val cpf: String = id.cpf,

        @DynamoDBRangeKey(attributeName = "rg")
        val rg: String = id.rg
)

data class UserEntityId(

        @get:DynamoDBHashKey
        val cpf: String = "",

        @get:DynamoDBRangeKey
        val rg: String = ""
)