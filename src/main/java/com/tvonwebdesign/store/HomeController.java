package com.tvonwebdesign.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${home.message}")
    private String message;

    @Value("${home.userName}")
    private String userName;


    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);
        model.addAttribute("userName", userName);
        return "home"; //view
    }

}
