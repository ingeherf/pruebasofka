package com.example.spaceship.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {


    @GetMapping(value = "/")
    public String getIndex() {
        return "index";
    }

}
