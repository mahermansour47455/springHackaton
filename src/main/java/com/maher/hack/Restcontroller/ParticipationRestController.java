package com.maher.hack.Restcontroller;

import com.maher.hack.Service.ParticipationService;
import com.maher.hack.entities.Participation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participation")
@CrossOrigin
public class ParticipationRestController {

    @Autowired
    private ParticipationService participationService;

    @RequestMapping(method = RequestMethod.POST)
    public Participation saveParticipation(@RequestBody Participation p){
        return participationService.saveParticipation(p);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Participation> getAllParticipation(){
        return participationService.getAllParticipation();
    }

    @RequestMapping(value = "hack/{id}",method = RequestMethod.GET)
    public List<Participation> getParticipationByIdhackathon(@PathVariable("id") Long id){
        return participationService.getParticipationByIdhackathon(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteParticipation(@PathVariable("id") Long id){
        participationService.deleteParticipation(id);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Participation updateParticipation(@RequestBody Participation p){
        return participationService.updateParticipation(p);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Participation getParticipationById(@PathVariable("id") Long id){
        return participationService.getParticipationById(id);
    }
    @RequestMapping(value = "/score/{id}",method = RequestMethod.GET)
    public List<Participation> getallParticipationOrderByScore(@PathVariable("id") Long id){
        return participationService.getallParticipationOrderByScore(id);
    }


}
