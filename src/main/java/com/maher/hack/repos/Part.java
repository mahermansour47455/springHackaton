package com.maher.hack.repos;

import com.maher.hack.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Part extends JpaRepository<Participant,Long> {

    @Query("select p from Participant p where p.nomPar like %?1%")
   List<Participant> findByNomPar(String nomPar);




}
