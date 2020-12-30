package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/page")
    public String firstPage(){
        return "second/page";
    } //осветлить картинку

    @GetMapping("/page2")
    public String secondPage(){
        return "second/page2";
    } //открыть картинку как txt

    @GetMapping("/page3")
    public String thirdPage(){
        return "second/page3";
    } //картинка большого расширения
}
