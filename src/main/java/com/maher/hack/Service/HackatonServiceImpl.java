package com.maher.hack.Service;

import com.maher.hack.entities.Hackaton;
import com.maher.hack.repos.HackatonRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HackatonServiceImpl implements HackatonService{

    @Autowired
    private HackatonRepos hackatonRepos;
    @Override
    public Hackaton saveHackaton(Hackaton h) {
        return hackatonRepos.save(h);
    }

    @Override
    public List<Hackaton> getAllHackaton() {
        return hackatonRepos.findAll();
    }

    @Override
    public Hackaton getHackatonById(Long id) {
        return hackatonRepos.findHackatonById(id);
    }

    @Override
    public Hackaton updateEmploye(Hackaton emp) {
        return hackatonRepos.save(emp);
    }

    @Override
    public void deleteHackaton(Long id) {
        hackatonRepos.deleteById(id);
    }


}
