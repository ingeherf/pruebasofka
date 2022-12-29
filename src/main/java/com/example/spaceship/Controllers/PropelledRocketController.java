package com.example.spaceship.Controllers;

import com.example.spaceship.Service.PropelledRocketService;
import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.PropelledRocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PropelledRocketController {

    @Autowired
    private PropelledRocketService propelledRocketService;

    @PostMapping(value = "/añadirNave/3")
    public String guardar(@ModelAttribute(value = "rocket") PropelledRocket rocket) {
        propelledRocketService.newShip(rocket);
        return "redirect:/";
    }
}
