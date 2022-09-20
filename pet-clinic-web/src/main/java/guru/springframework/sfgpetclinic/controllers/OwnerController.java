package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index.html","/index"})
    private String listOwners(){
        return "owners/index"; //thymeleaf busca el template llamado owners/index
    }
}
