package com.maher.hack.Restcontroller;

import com.maher.hack.Service.ParticiapntService;
import com.maher.hack.entities.Participant;
import com.maher.hack.entities.Participation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Participant")
@CrossOrigin
public class ParResControlller {

    @Autowired
    private ParticiapntService particiapntService;

    @RequestMapping(method = RequestMethod.POST)
    public Participant savePart(@RequestBody Participant p ) {
        return particiapntService.saveParticipant(p);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Participant>getAllPart()
    {
        return particiapntService.getAllParticipant();
    }
    @RequestMapping(value="/{name}",method = RequestMethod.GET)
    public List<Participant> getParticipationByname(@PathVariable("name") String name){
        return particiapntService.getParticipantByName(name);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteParticipation(@PathVariable("id") Long id){
        particiapntService.deleteParticipant(id);
    }


}
