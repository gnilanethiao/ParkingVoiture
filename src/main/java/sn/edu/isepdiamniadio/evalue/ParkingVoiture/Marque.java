package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marque implements Serializable{

    @Id
    @Column(nullable = false, unique=true)
    private String code;
    private String nom;
    private String description;

    public Marque(){

    }

    public Marque(String code, String nom, String description){
        this.code = code;
        this.nom = nom;
        this.description = description;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "code="+ this.code + "nom="+ this.nom + "description="+this.description;
    }
    

    
}
