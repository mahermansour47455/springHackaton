package com.maher.hack.Service;

import com.maher.hack.entities.Hackaton;

import java.util.List;


public interface HackatonService {

    Hackaton saveHackaton(Hackaton h);
    List<Hackaton>getAllHackaton();
    Hackaton getHackatonById(Long id);


    Hackaton updateEmploye(Hackaton emp);

    void deleteHackaton(Long id);
}
