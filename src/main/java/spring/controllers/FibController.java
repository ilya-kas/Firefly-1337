package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FibController {

    @GetMapping("/hello")
    public String firstPage(){
        return "first/hello";
    }

    /*@GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "double",required = false) Double x,
                              @RequestParam(value = "str") String s){
        System.out.println(x+" "+s);
        return "first/goodbye";
    }*/
}
