package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {
    @GetMapping("/page")
    public String mazePage(){
        return "third/maze";
    }
}

