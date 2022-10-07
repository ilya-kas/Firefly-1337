package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * images riddles
 */
@Controller
@RequestMapping("/leader(like-in-camps)-42")
public class ImagesController {
    @GetMapping("/page")
    public String firstPage(){
        return "leader(like-in-camps)-42/page";
    } //light up a pic

    @GetMapping("/page42")
    public String secondPage(){
        return "leader(like-in-camps)-42/page42";
    } //read a comment

    @GetMapping("/page3")
    public String thirdPage(){
        return "leader(like-in-camps)-42/page3";
    } //big resolution pic
}
