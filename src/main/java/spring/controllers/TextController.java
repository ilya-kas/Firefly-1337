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
    } //russian in english keyboard

    @GetMapping("/lorem-ipsum")
    public String qrCode(){
        return "duel-33/lorem-ipsum";
    } //old telephones

    @GetMapping("/last")
    public String last(){
        return "duel-33/last";
    } //old telephones
}

