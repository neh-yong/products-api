package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "API running - " + LocalDate.now();
    }

    @GetMapping("/person-age")
    public String personAge(
            @RequestParam int year,
            @RequestParam int month,
            @RequestParam int day) {

        Person person = new Person(
                123,
                "Ram Bahadur Karki",
                LocalDate.of(year, month, day)
        );

        return person.calculateAge();
    }
}
