package com.dassuncao.spring.data.dynamodb.sample.configuration

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.AWSCredentialsProvider
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.dassuncao.spring.data.dynamodb.sample.configuration.properties.AWSProperties
import com.dassuncao.spring.data.dynamodb.sample.repository.UserRepository
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableDynamoDBRepositories(basePackageClasses = [UserRepository::class])
class DynamoDBConfiguration(private val awsProperties: AWSProperties) {

    @Bean
    fun amazonDynamoDB(): AmazonDynamoDB = AmazonDynamoDBClientBuilder
            .standard()
            .withCredentials(awsCredentialsProvider())
            .withRegion(awsProperties.region)
            .build()

    private fun awsCredentialsProvider(): AWSCredentialsProvider =
            AWSStaticCredentialsProvider(awsCredentials())

    private fun awsCredentials(): AWSCredentials = BasicAWSCredentials(
            awsProperties.accessKey,
            awsProperties.secretKey)
}