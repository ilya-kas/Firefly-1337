package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fortress-9")
public class MazesController {

    @GetMapping("/maze")
    public String mazePage(){
        return "fortress-9/maze";
    } //maze

    @GetMapping("/code")
    public String qrCode(){
        return "fortress-9/code";
    } //qr-code with color inversion
}

