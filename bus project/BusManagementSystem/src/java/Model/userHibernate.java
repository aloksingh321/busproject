/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author ALOK SINGH
 */
public class userHibernate {
    
    public boolean save1(String name,String pass,String Email,String ID)
    {
       User obj= new User(name,pass,Email,ID);
       
       Configuration  cf = new Configuration();
        cf.configure("cmjpackage/hibernate.cfg.xml");
        
     SessionFactory sf = cf.buildSessionFactory();
     
     Session session = sf.openSession();
     
     Transaction tx = session.beginTransaction();
     session.save(obj);
     tx.commit();
     session.close();
     sf.close();
    //System.out.println(s.getName()+":"+s.getPassword());     
         return true;
   }  
     public static boolean  get(String name,String pass)
    {
        User s=null;
       User obj = new User();
       Configuration  cf = new Configuration();
     cf.configure("cmjpackage/hibernate.cfg.xml");
    SessionFactory sf = cf.buildSessionFactory();
     
     Session session = sf.openSession();
     
     Transaction tx = session.beginTransaction();
    s=(User)session.get(User.class,name);
  // session.save(s);
     tx.commit();
     session.close();
     sf.close();
   
     //System.out.println(s);
    if(s.getName().equals(name) && s.getPassword().equals(pass))
    {  
      //  System.out.println("hello world");
      return true;
      
    }
       return false;
    }
   public static void main(String args[])
   {
  /*   User obj = new User("alok2","123","abc@gmail.com","1611981234");
     //  User s=null;
      Configuration  cf = new Configuration();
        cf.configure("cmjpackage/hibernate.cfg.xml");
        
     SessionFactory sf = cf.buildSessionFactory();
     
     Session session = sf.openSession();
     *
     Transaction tx = session.beginTransaction();
    //s=(User)session.get(User.class,"alok2"); 
    session.save(obj);
     tx.commit();
     session.close();
      sf.close();
         
    System.out.println(s);*/
  //  userHibernate.get("alok2","123");
}

    

}