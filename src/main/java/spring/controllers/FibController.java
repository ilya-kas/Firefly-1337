package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/first")
public class FibController {
    private final Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,5));

    @GetMapping("/hello")
    public String firstPage(){
        return "first/hello";
    }

    @GetMapping("/problem")
    public String taskPage(@RequestParam(value = "x") int x, Model model){
        if (x==8)
            return "first/next";
        if (!numbers.contains(x)){
            return "first/error";
        }
        switch (x){
            case 1:model.addAttribute("next",2);break;
            case 2:model.addAttribute("next",3);break;
            default:model.addAttribute("next",5);
        }
        switch (x){
            case 1:
            case 2:
            case 3:model.addAttribute("number", x);break;
            //case 5:model.addAttribute("number", "И куда теперь?");break;
            case 5:model.addAttribute("number", "What to do now?");break;
        }
        return "first/problem";
    }
}
