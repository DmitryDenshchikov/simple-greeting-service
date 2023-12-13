package denshchikov.dmitry.taskcreator.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/greeting")
class GreetingController {

    @GetMapping
    fun createTask() = "hey!"

}