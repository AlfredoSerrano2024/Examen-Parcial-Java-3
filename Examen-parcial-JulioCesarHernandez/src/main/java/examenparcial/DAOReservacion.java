/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

public class DAOReservacion {
    public SessionFactory sessionFactory;
    public Session sesion;
    public Transaction transa;
    
    public DAOReservacion(){
    sessionFactory=HibernateUtilidades.getSessionFactory();
   sesion=sessionFactory.openSession();
   transa=sesion.beginTransaction();
}
    public void cerrarTodo()
            {
            transa.commit();
            sesion.close();
            
            }  
    
    public void guardar(Reservacion reservacion) throws Exception{ 
        sesion.save(reservacion);
        cerrarTodo();
    
    }
}
    

