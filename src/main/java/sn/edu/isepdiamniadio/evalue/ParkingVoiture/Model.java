package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Model implements Serializable{

    @Id
    private String type;
    private Date debutProduction;
    private Date finProduction;


    @ManyToOne
    private Marque marque;


    public Model(){

    }
    
    public Model(String type, Date debutProduction, Date finProduction){
        this.type = type;
        this.debutProduction = debutProduction;
        this.finProduction = finProduction;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Date getDebutProduction() {
        return debutProduction;
    }
    public void setDebutProduction(Date debutProduction) {
        this.debutProduction = debutProduction;
    }

    public Date getFinProduction() {
        return finProduction;
    }
    public void setFinProduction(Date finProduction) {
        this.finProduction = finProduction;
    }

    public String toString(){
        return "type="+this.type + "debutProduction="+this.debutProduction + "finProduction="+this.finProduction;
    }
}
