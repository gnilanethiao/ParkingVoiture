package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Client implements Serializable {
    @Id
    private Integer id;
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;


    @OneToOne
    private Achat achat;
    public Client() {

    }

    public Client(Integer id, String prenom, String nom, Date dateNaissance, String adresse, String telephone){
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString(){
        return "id=" + this.id + "prenom="+ this.prenom + "nom="+this.nom + "dateNaissance="+this.dateNaissance + "adresse="+this.adresse + "telephone="+this.telephone;
    }
}