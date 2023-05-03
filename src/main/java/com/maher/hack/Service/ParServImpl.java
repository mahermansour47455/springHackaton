package com.maher.hack.Service;

import com.maher.hack.entities.Participant;
import com.maher.hack.repos.Part;
import com.maher.hack.repos.ParticipationRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParServImpl implements ParticiapntService{

    @Autowired
    private Part participationRepos;
    @Override
    public Participant saveParticipant(Participant p) {
        return participationRepos.save(p);
    }

    @Override
    public List<Participant> getAllParticipant() {
        return participationRepos.findAll();
    }

    @Override
    public List<Participant> getParticipantByName(String name) {
        return participationRepos.findByNomPar(name);
    }

    @Override
    public void deleteParticipant(Long id) {
        participationRepos.deleteById(id);
    }
}
