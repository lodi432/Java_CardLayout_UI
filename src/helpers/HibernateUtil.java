/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
    private static Session session = null;

    protected HibernateUtil() {
        
    } 
    public static Session getSession() {
        if (session == null) {
            try {
                  
                session = new Configuration().configure().buildSessionFactory().openSession();
            } catch (Throwable ex) {
                System.err.println("Kreiranje Initial SessionFactory neuspjelo: " + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return session;
    }
}
