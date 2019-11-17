package com.dassuncao.spring.data.dynamodb.sample

import com.dassuncao.spring.data.dynamodb.sample.configuration.properties.AWSProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AWSProperties::class)
class SpringBootDynamodbSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootDynamodbSampleApplication>(*args)
}
