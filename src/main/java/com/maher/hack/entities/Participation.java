package com.maher.hack.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParticipation;

    private Date dateParticipation;
    private double note;
    private int classement;

    @ManyToOne()
    private Team team;
    @ManyToOne
    private Hackaton hackaton;


    public Participation() {
        super();
    }
       public Participation(Date dateParticipation, double note, int classement, Team team, Hackaton hackaton) {
            super();
            this.dateParticipation = dateParticipation;
            this.note = note;
            this.classement = classement;
            this.team = team;
            this.hackaton = hackaton;
        }
        public void setId(Long id) {
            this.idParticipation = id;
        }
        public Long getId() {
            return idParticipation;
        }
        public Date getDateParticipation() {
            return dateParticipation;
        }
        public void setDateParticipation(Date dateParticipation) {
            this.dateParticipation = dateParticipation;
        }
        public double getNote() {
            return note;
        }
        public void setNote(double note) {
            this.note = note;
        }
        public int getClassement() {
            return classement;
        }
        public void setClassement(int classement) {
            this.classement = classement;
        }
        public Team getTeam() {
            return team;
        }
        public void setTeam(Team team) {
            this.team = team;
        }
        public Hackaton getHackaton() {
            return hackaton;
        }
        public void setHackaton(Hackaton hackaton) {
            this.hackaton = hackaton;
        }




}
