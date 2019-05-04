/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.TBH;
import hiber.*;
import hiber.TBH.contract;
import hiber.TBH.regular;
import hiber.TBH.Emp;
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
       
    //Address add = new Address();
    //add.setCity("abc");
    //add.setState("def");
   // Student s = new Student(12,"hjdsj",21);
   // s.setAddress(add);
    Configuration  cf = new Configuration();
   cf.configure("cmjpackage/hibernate.cfg.xml");
        
     SessionFactory sf = cf.buildSessionFactory();
     
     Session session = sf.openSession();
     
     Transaction tx = session.beginTransaction();
     session.save(e);
     session.save(r);
     session.save(c);
     tx.commit();
     session.close();
     sf.close();
    //System.out.println(s.getName()+":"+s.getPassword());     
      
   
   }
   
}
