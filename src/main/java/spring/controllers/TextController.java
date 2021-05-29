package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/duel-33")
public class TextController {

    @GetMapping("/text")
    public String mazePage(){
        return "duel-33/text";
    } //русский в английской расскладке

    @GetMapping("/lorem-ipsum")
    public String qrCode(){
        return "duel-33/lorem-ipsum";
    } //кнопочный телефон

    @GetMapping("/last")
    public String last(){
        return "duel-33/last";
    } //кнопочный телефон
}

