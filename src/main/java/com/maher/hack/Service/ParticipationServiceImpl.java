package com.maher.hack.Service;

import com.maher.hack.entities.Participation;
import com.maher.hack.repos.ParticipationRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipationServiceImpl implements ParticipationService {

    @Autowired
    private ParticipationRepos participationRepos;
    @Override
    public Participation saveParticipation(Participation p) {
        return participationRepos.save(p);
    }

    @Override
    public List<Participation> getAllParticipation() {
        return participationRepos.findAll();
    }

    @Override
    public List<Participation> getParticipationByIdhackathon(Long id) {
        return participationRepos.getParticipationByIdhackathon(id);
    }

    @Override
    public void deleteParticipation(Long id) {
        participationRepos.deleteById(id);
    }

    @Override
    public Participation updateParticipation(Participation p) {
        return participationRepos.save(p);
    }

    @Override
    public Participation getParticipationById(Long id) {
        return participationRepos.getParticipationById(id);
    }

    @Override
    public List<Participation> getallParticipationOrderByScore(long id) {
        return participationRepos.getParticipationByScore(id);
    }


}
