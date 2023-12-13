package denshchikov.dmitry.taskcreator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleGreetingApplication

fun main(args: Array<String>) {
	runApplication<SimpleGreetingApplication>(*args)
}
