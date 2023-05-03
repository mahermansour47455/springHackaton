package com.maher.hack.repos;

import com.maher.hack.entities.Hackaton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HackatonRepos extends JpaRepository<Hackaton, Long>{

    @Query("select h from Hackaton h where h.id=?1")
    Hackaton findHackatonById(Long id);

    @Modifying
    @Query("update Hackaton h set h.nbreEquipeHack = h.nbreEquipeHack - 1 where h.id = ?1")
    void updateNbreEquipeHack(Long id);








}
