package com.maher.hack.Service;

import com.maher.hack.entities.Team;
import com.maher.hack.repos.EquipeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService {


     @Autowired
    private EquipeRepos equipeRepos;
    @Override
    public Team saveTeam(Team t) {
        return equipeRepos.save(t);
    }

    @Override
    public List<Team> getAllTeam() {
        return equipeRepos.findAll();
    }

    @Override
    public void deleteTeam(Long id) {
        equipeRepos.deleteById(id);
    }

    @Override
    public List<Team> findTeamByName(String name) {
        return equipeRepos.findTeamByName(name);
    }

}
