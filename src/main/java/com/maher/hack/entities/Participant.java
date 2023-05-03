package com.maher.hack.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.maher.hack.entities.Team;

import java.util.Date;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPar;

    private String nomPar;

    private String emailPar;

    private Date dateNaissancePar;

    @ManyToOne
    private Team team;




    public Participant() {
        super();
    }
    public Participant(String nomPar, String emailPar, Date dateNaissancePar, Team teamName) {
        super();
        this.nomPar = nomPar;
        this.emailPar = emailPar;
        this.dateNaissancePar = dateNaissancePar;
        this.team = teamName;
    }
    public void setId(Long id) {
        this.idPar = id;
    }


    public Long getId() {
        return idPar;
    }
    public String getNomPar() {
        return nomPar;
    }
    public void setNomPar(String nomPar) {
        this.nomPar = nomPar;
    }
    public String getEmailPar() {
        return emailPar;
    }
    public void setEmailPar(String emailPar) {
        this.emailPar = emailPar;
    }
    public Date getDateNaissancePar() {
        return dateNaissancePar;
    }
    public void setDateNaissancePar(Date dateNaissancePar) {
        this.dateNaissancePar = dateNaissancePar;
    }
    public Team getTeamName() {
        return team;
    }
    public void setTeamName(Team teamName) {
        this.team = teamName;
    }




}
