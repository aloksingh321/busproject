/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.collectionm;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ALOK SINGH
 */
public class Test {
 public static void main (String args[])
   {   

    
       Student s = new Student();
       s.setName("aloksingh");
       
     List<String> list = new ArrayList();
     list.add("abc");
     list.add("def");
     list.add("ghi");
     s.setAddress(list);
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
     session.save(s);
    
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
