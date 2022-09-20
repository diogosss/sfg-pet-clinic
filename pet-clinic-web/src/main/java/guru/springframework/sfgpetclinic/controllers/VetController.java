package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index.html","/vets/index"})
    private String listVets(){
        return "vets/index"; //thymeleaf busca el template llamado vets/index
    }
}
