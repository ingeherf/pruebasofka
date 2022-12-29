package com.example.spaceship.Controllers;

import com.example.spaceship.Service.NoTripulatedRocketService;
import com.example.spaceship.Service.PropelledRocketService;
import com.example.spaceship.Service.TripulatedRocketService;
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
    private TripulatedRocketService tripulatedRocketService;

    @Autowired
    private PropelledRocketService propelledRocketService;

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


    @GetMapping(value = "/verCatalogo")
    public String verCatalogo(Model model) {
        //List<NoTripulatedRocket> listaNTR = noTripulatedRocketService.getFilterResults(
         //       null, "IV", null, null, null, null, null,
          //      null, null, null);
        List<NoTripulatedRocket> listaNTR = noTripulatedRocketService.getAllShipsNoDeleted(null);
        List<TripulatedRocket> listaTR = tripulatedRocketService.getAllShipsNoDeleted(null);
        List<PropelledRocket> listaPR = propelledRocketService.getAllShipsNoDeleted(null);
        Rocket rocket = new Rocket();

        model.addAttribute("rocket", rocket);
        model.addAttribute("NoTripulados", listaNTR);
        model.addAttribute("Tripulados", listaTR);
        model.addAttribute("Propulsor", listaPR);
        return "catalogo";
    }


    @PostMapping(value = "/verCatalogo/Filtrado")
    public String verCatalogo(@ModelAttribute("rocket") Rocket rocket,
                              Model model)
    {
        List<NoTripulatedRocket> listaNTR = noTripulatedRocketService.getFilterResults(
                null, rocket.getName(), rocket.getSpeed(), rocket.getWeight(), rocket.getHeight(),
                rocket.getLoadWeight(), rocket.getTotalDistance(),
                rocket.getCompany(), rocket.getCountry(), null);

        List<TripulatedRocket> listaTR = tripulatedRocketService.getFilterResults(
                null, rocket.getName(), rocket.getSpeed(), rocket.getWeight(), rocket.getHeight(),
                rocket.getLoadWeight(), rocket.getTotalDistance(),
                rocket.getCompany(), rocket.getCountry(), null);

        List<PropelledRocket> listaPR = propelledRocketService.getFilterResults(
                null, rocket.getName(), rocket.getSpeed(), rocket.getWeight(), rocket.getHeight(),
                rocket.getLoadWeight(), rocket.getTotalDistance(),
                rocket.getCompany(), rocket.getCountry(), null);

        model.addAttribute("NoTripulados", listaNTR);
        model.addAttribute("Tripulados", listaTR);
        model.addAttribute("Propulsor", listaPR);
        return "catalogo";
    }


    /**
     * Verificación de si una instancia de tipo Rocket es null o no a pesar de su
     * Inicialización
     */
    private boolean verificarNullRocket(Rocket rocket) {
        return ((rocket.getHeight() == null)
                && rocket.getCompany().equals(null)
                && rocket.getCountry().equals(null)
                && rocket.getName().equals(null)
                && rocket.getLoadWeight() == null
                && rocket.getSpeed() == null
                && rocket.getTotalDistance() == null
                && rocket.getWeight() == null
        )? true:false;

    }
}
