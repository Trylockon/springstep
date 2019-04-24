package bab.lec.springstep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("api/")
public class MainController {

    @RequestMapping(value={"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Welcome to the main page of the FREEMARKER version of the online shop project done by Kirill Babiak !");
        return  "index";
    }
}
