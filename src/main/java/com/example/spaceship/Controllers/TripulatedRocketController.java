package com.example.spaceship.Controllers;

import com.example.spaceship.Service.TripulatedRocketService;
import com.example.spaceship.models.Entities.TripulatedRocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TripulatedRocketController {

    @Autowired
    private TripulatedRocketService tripulatedRocketService;

    @PostMapping(value = "/añadirNave/2")
    public String guardar(@ModelAttribute(value = "rocket") TripulatedRocket rocket) {
        tripulatedRocketService.newShip(rocket);
        return "redirect:/";
    }
}
