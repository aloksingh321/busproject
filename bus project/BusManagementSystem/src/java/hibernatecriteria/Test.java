/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatecriteria;

 

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ALOK SINGH
 */
public class Test {
    
    
   public static void main (String args[])
   {   

     // Student s=null;
     List <Student> list = null;
     Configuration cf=null;
      SessionFactory sf=null;
      Session session = null;
     try 
     {
      cf = new Configuration();
   cf.configure("cmjpackage/hibernate.cfg.xml");
        
      sf = cf.buildSessionFactory();
     
      session = sf.openSession();
     
     Transaction tx = session.beginTransaction();
    Criteria criteria = session.createCriteria(Student.class);
    //criteria.add(Restrictions.lt("id",8)).add(Restrictions.gt("id",5));
    //criteria.setFirstResult(5);
    //criteria.setMaxResults(2);
    criteria.addOrder(Order.desc("marks"));

     list = criteria.list();
     
    
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }
   for(Student s: list)
   {
     System.out.println(s);  
   }
   }
   
}
