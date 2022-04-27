package io.github.girlsday

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) = runApplication<CupCakeApplication>(*args).let { }

@SpringBootApplication
@EnableProcessApplication
class CupCakeApplication {

}
