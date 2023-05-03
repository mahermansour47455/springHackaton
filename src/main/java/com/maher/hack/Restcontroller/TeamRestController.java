package com.maher.hack.Restcontroller;


import com.maher.hack.Service.EquipeService;
import com.maher.hack.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Team")
@CrossOrigin
public class TeamRestController {


    @Autowired
    private EquipeService equipeService;

    @RequestMapping(method = RequestMethod.POST)
    public Team saveTeam(@RequestBody Team t) {
        return equipeService.saveTeam(t);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Team>getAllTeamm()
    {
        return equipeService.getAllTeam();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteTeam(@PathVariable("id") Long id)
    {
        equipeService.deleteTeam(id);
    }
    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public List<Team>findTeamByName(@PathVariable("name") String name)
    {
        return equipeService.findTeamByName(name);
    }

}
