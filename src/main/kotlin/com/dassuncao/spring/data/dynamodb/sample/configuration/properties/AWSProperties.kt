package com.dassuncao.spring.data.dynamodb.sample.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("amazon.aws")
data class AWSProperties(val accessKey: String, val secretKey: String, val region: String)