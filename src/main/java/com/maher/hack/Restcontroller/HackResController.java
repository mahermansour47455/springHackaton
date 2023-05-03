package com.maher.hack.Restcontroller;


import com.maher.hack.Service.HackatonService;
import com.maher.hack.entities.Hackaton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hackaton")
@CrossOrigin(origins = "http://localhost:3000")
public class HackResController {

    @Autowired
    private HackatonService hackatonService;


    @RequestMapping(method = RequestMethod.POST)
    public Hackaton svaeHackaton(@RequestBody Hackaton h ) {
        return hackatonService.saveHackaton(h);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Hackaton>getAllHackaton() {
        return hackatonService.getAllHackaton();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Hackaton getHackatonById(@PathVariable("id") Long id) {
        return hackatonService.getHackatonById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Hackaton updateEmploye(@RequestBody Hackaton employe) {
        return hackatonService.updateEmploye(employe);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteHackaton(@PathVariable("id") Long id) {
        hackatonService.deleteHackaton(id);

    }




}
