package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/love-13")
public class FinalController {

    @GetMapping("/final")
    public String lastPage(){
        return "love-13/final";
    } //русский в английской расскладке
}

