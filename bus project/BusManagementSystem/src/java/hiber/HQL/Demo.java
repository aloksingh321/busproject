/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.HQL;

 

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
    
//   Query query = session.createQuery("from Student");
      // "from Student where id> :n and id<:m"
      //here id is variable name" 
     //"delete from Student where id = :n"
    Query query = session.createQuery("from Student where id > 5"); 
      query.setParameter("n",5);
      query.setParameter("m", 8);
      //query.setFirstResult(5);
    // query.setMaxResults(5);
    
    // query.excuteupdate();
    list  = query.list();
     
     
     
     
     /*  for(int i=0;i<=10;i++)
     {
        s = new Student();
        s.setName("L"+i);
        s.setMarks(i*12);
        session.save(s);
     }*/
     
     
     
    // session.save(c);
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }
    //System.out.println(s.getName()+":"+s.getPassword())v v  v           ;     
      //System.out.println("Build Sucessful");
      for(Student s:list)
      {
          System.out.println(s);
      }
   
   }
   
}
