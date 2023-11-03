package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Achat implements Serializable{
    @Id
    private Integer id;
    private Date dateAchat;
    private Double montant;


    @OneToOne
    private Voiture voiture;
    public Achat(){

    }

    public Achat(Integer id, Date dateAchat, Double montant){
        this.id = id;
        this.dateAchat = dateAchat;
        this.montant = montant;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }
    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getMontant() {
        return montant;
    }
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String toString(){
        return "id="+ this.id +"dateAchat="+ this.dateAchat +"montant="+this.montant;
    }
}
