package com.fierwood.sprinbootsimplethymeleaf.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private LocalDate birth;
}
