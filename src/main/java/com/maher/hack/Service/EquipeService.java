package com.maher.hack.Service;

import com.maher.hack.entities.Team;

import java.util.List;

public interface EquipeService {


    Team saveTeam(Team t);
    List<Team> getAllTeam();
    void deleteTeam(Long id);
    List<Team>findTeamByName(String name);

}
