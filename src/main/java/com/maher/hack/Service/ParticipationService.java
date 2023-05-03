package com.maher.hack.Service;

import com.maher.hack.entities.Participation;
import com.maher.hack.repos.ParticipationRepos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ParticipationService {

    Participation saveParticipation(Participation p);
    List<Participation>getAllParticipation();

    List<Participation> getParticipationByIdhackathon(Long id);

    void deleteParticipation(Long id);
    Participation updateParticipation(Participation p);
    Participation getParticipationById(Long id);
    List<Participation>getallParticipationOrderByScore(long id);
}
