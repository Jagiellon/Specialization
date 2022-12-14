package CourseProject.Specialization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public
class SpecializationController {
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
}
