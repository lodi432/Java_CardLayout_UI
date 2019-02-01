/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author MacaZekoMiš
 */
@Entity
public class Meals extends Entitet {

    @Override
    public String toString() {
        return "Naziv : " + naziv + ", Opis : " + opis + '}';
    }
    
//   public String getPrezimeIme(){
//   return getNaziv()+ " " + getOpis();
//    }
      private String naziv;
      private String opis;
      private String dpath;
      private Date created_at;
      private Date updated_at;
    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

     @PrePersist
  public void onCreate() {
    created_at = new Date();
  }

  @PreUpdate
  public void onUpdate() {
    updated_at = new Date();
  }
   

  
}
