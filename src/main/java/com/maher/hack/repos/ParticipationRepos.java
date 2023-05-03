package com.maher.hack.repos;

import com.maher.hack.entities.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParticipationRepos extends JpaRepository<Participation,Long> {

    @Query("select p from Participation p where p.hackaton.idHack=?1")
    List<Participation> getParticipationByIdhackathon(Long id);
    @Query("select p from Participation p where p.idParticipation=?1")
    Participation getParticipationById(Long id);

    //je veut requete me rendre les participation trier par score pour chaque hackathon
    @Query("select p from Participation p where p.hackaton.idHack=?1 order by p.note desc")
    List<Participation> getParticipationByScore(long id);

}
