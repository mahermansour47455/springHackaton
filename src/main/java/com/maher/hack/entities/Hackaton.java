package com.maher.hack.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hackaton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHack;

        private String nomHack;
        private String descriptionHack;
        private String dateDebutHack;
        private String dateFinHack;
        private String lieuHack;
        private int nbreEquipeHack;
        private int nbreParticipantHack;
        private String prixHack;
    @OneToMany(mappedBy = "hackaton")
    @JsonIgnore
    private List<Participation> participation;


    public Hackaton() {
            super();
        }

        public Hackaton(String nomHack, String descriptionHack, String dateDebutHack, String dateFinHack, String lieuHack, int nbreEquipeHack, int nbreParticipantHack, String prixHack) {
            super();
            this.nomHack = nomHack;
            this.descriptionHack = descriptionHack;
            this.dateDebutHack = dateDebutHack;
            this.dateFinHack = dateFinHack;
            this.lieuHack = lieuHack;
            this.nbreEquipeHack = nbreEquipeHack;
            this.nbreParticipantHack = nbreParticipantHack;
            this.prixHack = prixHack;

        }
        public Long getIdHack() {
            return idHack;
        }
        public void setIdHack(Long idHack) {
            this.idHack = idHack;
        }

        public String getNomHack() {
            return nomHack;
        }

        public void setNomHack(String nomHack) {
            this.nomHack = nomHack;
        }

        public String getDescriptionHack() {
            return descriptionHack;
        }

        public void setDescriptionHack(String descriptionHack) {
            this.descriptionHack = descriptionHack;
        }

        public String getDateDebutHack() {
            return dateDebutHack;
        }

        public void setDateDebutHack(String dateDebutHack) {
            this.dateDebutHack = dateDebutHack;
        }

        public String getDateFinHack() {
            return dateFinHack;
        }

        public void setDateFinHack(String dateFinHack) {
            this.dateFinHack = dateFinHack;
        }

        public String getLieuHack() {
            return lieuHack;
        }

        public void setLieuHack(String lieuHack) {
            this.lieuHack = lieuHack;
        }

        public int getNbreEquipeHack() {
            return nbreEquipeHack;
        }
        public void setNbreEquipeHack(int nbreEquipeHack) {
            this.nbreEquipeHack = nbreEquipeHack;
        }
        public int getNbreParticipantHack() {
            return nbreParticipantHack;
        }
        public void setNbreParticipantHack(int nbreParticipantHack) {
            this.nbreParticipantHack = nbreParticipantHack;
        }
        public String getPrixHack() {
            return prixHack;
        }
        public void setPrixHack(String prixHack) {
            this.prixHack = prixHack;
        }
        public List<Participation> getParticipation() {
            return participation;
        }
        public void setParticipation(List<Participation> participation) {
            this.participation = participation;
        }

}
