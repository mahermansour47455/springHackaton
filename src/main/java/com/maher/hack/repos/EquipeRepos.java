package com.maher.hack.repos;

import com.maher.hack.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipeRepos extends JpaRepository<Team, Long> {

    @Query("select t from Team t where t.TeamName like %?1%")
    List<Team> findTeamByName(String name);
}
