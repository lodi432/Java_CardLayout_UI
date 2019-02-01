/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import model.Meals;
import helpers.CustomeException;

/**
 *
 * @author MacaZekoMiš
 */
public class MealsController extends MainController implements ObradaInterface<Meals> {
      
     public List<Meals> getEntiteti(){
        return session.createQuery("from Jelas").list();
    }
     
            public List<Meals> getEntiteti(String uvjet){
        return session.createQuery(" from Jelas e where "
                + " concat(e.naziv, ' ', e.opis) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    } 
      
    @Override
    public Meals dodaj(Meals e) throws CustomeException {
       
        spremi(e);
        return e;
    }

    @Override
    public Meals promjena(Meals e) throws CustomeException {
    
        spremi(e);
        return e;
    }
     

}
