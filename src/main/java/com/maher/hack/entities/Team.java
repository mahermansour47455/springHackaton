package com.maher.hack.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String TeamName;
    private String TeamDescription;



    @OneToMany(mappedBy = "team")
    @JsonIgnore

    private List<Participant> participants;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<Participation> participations;


    public Team() {
        super();
    }
    public Team(String teamName, List<Participant> participants) {
        super();
        TeamName = teamName;
        this.participants = participants;
    }
    public String getTeamName() {
        return TeamName;
    }
    public void setTeamName(String teamName) {
        TeamName = teamName;
    }
    public List<Participant> getParticipants() {
        return participants;
    }
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
    public List<Participation> getParticipations() {
        return participations;
    }
    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }
    public String getTeamDescription() {
        return TeamDescription;
    }
    public void setTeamDescription(String teamDescription) {
        TeamDescription = teamDescription;
    }

}
