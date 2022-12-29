package com.example.spaceship.Controllers;

import com.example.spaceship.Service.NoTripulatedRocketService;
import com.example.spaceship.models.Entities.NoTripulatedRocket;
import com.example.spaceship.models.Entities.PropelledRocket;
import com.example.spaceship.models.Entities.Rocket;
import com.example.spaceship.models.Entities.TripulatedRocket;
import com.example.spaceship.models.Repositories.PropellerRepository;
import com.example.spaceship.models.Repositories.TripulatedRocketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MainPageController {

    @Autowired
    private NoTripulatedRocketService noTripulatedRocketService;

    @Autowired
    private TripulatedRocketRepo tripulatedRocketRepo;

    @Autowired
    private PropellerRepository propellerRepository;

    @RequestMapping(value = "/")
    public String getIndex() {
        return "index";
    }

    @GetMapping(value = "/añadirNave/{tipoNave}")
    public String getAddPage(@PathVariable(name = "tipoNave") int tipoNave, Model model) {

        if (tipoNave == 1) {
            NoTripulatedRocket rocket = new NoTripulatedRocket();
            model.addAttribute("rocket", rocket);
            return "addNTship";
        }
        else if (tipoNave == 2) {
            TripulatedRocket rocket = new TripulatedRocket();
            model.addAttribute("rocket", rocket);
            return "addTship";
        }
        else if(tipoNave == 3){
            PropelledRocket rocket = new PropelledRocket();
            model.addAttribute("rocket", rocket);
            return "addPship";
        }
        else {
            return "/error";
        }

    }


}
