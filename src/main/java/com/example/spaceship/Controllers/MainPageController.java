package com.example.spaceship.Controllers;

import com.example.spaceship.Service.NoTripulatedRocketService;
import com.example.spaceship.models.Entities.NoTripulatedRocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MainPageController {

    @Autowired
    private NoTripulatedRocketService noTripulatedRocketService;

    @RequestMapping(value = "/")
    public String getIndex(Model model) {
        //Optional<NoTripulatedRocket> data = noTripulatedRocketService.getInfo(1);
        List<NoTripulatedRocket> message = noTripulatedRocketService.getAll();
        if(!message.isEmpty()) {
            System.out.println(message.get(0).getCompany());
            model.addAttribute("nave", message.get(0));
        }
        return "index";
    }

}
