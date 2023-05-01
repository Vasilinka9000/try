package ru.neoflex.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public long Addition (@PathVariable() int a, @PathVariable int b){
        return a+b;
    }
    @GetMapping("/minus/{a}/{b}")
    public long Subtraction (@PathVariable() int a,@PathVariable int b){
        return a-b;
    }
}