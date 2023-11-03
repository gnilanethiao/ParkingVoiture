package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Voiture implements Serializable{

    @Id
    private String type;
    private Date dateProduction;
    private Integer nombrePlaces;


    
    @ManyToOne
    private Model model;
    public Voiture(){

    }

    public Voiture(String type, Date dateProduction, Integer nombrePlaces){
        this.type = type;
        this.dateProduction = dateProduction;
        this.nombrePlaces = nombrePlaces;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Date getDateProduction() {
        return dateProduction;
    }
    public void setDateProduction(Date dateProduction) {
        this.dateProduction = dateProduction;
    }

    public Integer getNombrePlaces() {
        return nombrePlaces;
    }
    public void setNombrePlaces(Integer nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String toString(){
        return "type="+this.type + "Integer nombrePlaces="+this.dateProduction + "nombrePlaces="+this.nombrePlaces;
    }


    
}
