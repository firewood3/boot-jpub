package com.fierwood.sprinbootsimplethymeleaf.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class ThymeleafController {

    @GetMapping("/simpleMessage")
    public String simpleMessage(Model model) {
        model.addAttribute("message", "sprintboot!");
        return "simpleMessage";
    }

    @GetMapping("/person")
    public String object(Model model) {
        Person person = new Person("KIM", 35, LocalDate.of(1985,03,22));
        model.addAttribute("person", person);
        return "person";
    }

    @GetMapping("/people")
    public String each(Model model) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("KIM", 35, LocalDate.of(1985,3,22)));
        people.add(new Person("LEE", 30, LocalDate.of(1990,2,2)));
        people.add(new Person("PARK", 40, LocalDate.of(1980,10,2)));
        model.addAttribute("people",people);
        return "people";
    }
}
