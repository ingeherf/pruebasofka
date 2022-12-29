package com.example.spaceship.Controllers;

import com.example.spaceship.Service.NoTripulatedRocketService;
import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoTripulatedRocketController {

    @Autowired
    private NoTripulatedRocketService noTripulatedRocketService;

    @PostMapping(value = "/añadirNave/1")
    public String guardar(@ModelAttribute(value = "rocket")NoTripulatedRocket rocket) {
        noTripulatedRocketService.newShip(rocket);
        return "redirect:/";
    }
}
