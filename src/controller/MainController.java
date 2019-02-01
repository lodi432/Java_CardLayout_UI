/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import helpers.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import model.Entitet;
import org.hibernate.Session;

public class MainController {
    protected Session session;
    
    public  MainController(){
        session=HibernateUtil.getSession();
    }
    
     
    protected void spremi(Entitet e){
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
    }
     public void obrisi(Entitet e){

        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();

       
    }
}
