/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.TBS;

 
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ALOK SINGH
 */
public class Demo {
    
    
   public static void main (String args[])
   {   

    Emp e  = new Emp();
    e.setId(101);
    e.setName("alok");
    
    regular r = new regular();
    
    r.setId(102);
    r.setName("amit");
    r.setSalary(500);
    
    contract c= new contract();
     c.setId(103);
    c.setName("alok");
    c.setAmount(500);
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
     session.save(e);
     session.save(r);
     session.save(c);
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }
    //System.out.println(s.getName()+":"+s.getPassword());     
      System.out.println("Build Sucessful");
   
   }
   
}
