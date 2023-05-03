package com.maher.hack.Service;

import com.maher.hack.entities.Participant;

import java.util.List;

public interface ParticiapntService {

    Participant saveParticipant(Participant p);
    List<Participant>getAllParticipant();
    List<Participant> getParticipantByName(String name);

    void deleteParticipant(Long id);
}
