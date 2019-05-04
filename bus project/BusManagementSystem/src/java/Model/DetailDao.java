/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Detail;
import Model.Admin;
import hibernatecriteria.Student;
import java.util.List;
import org.hibernate.Criteria;
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
public class DetailDao {
   
      public static boolean get1(String name,String pass)
      {
          Admin s=null;
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
    s=(Admin)session.get(Admin.class,name);
     session.save(s);
     
    if(s.getUser().equals(name) && s.getPassword().equals(pass))
    {  
      return true;    
    }     
  
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }
     return false;
     
    }

    public boolean save1(String a, String b, String c, String d,String e) {
       Detail obj = new Detail();
     obj.setBusno(a);
     obj.setDriverName(b);
     obj.setLicenseNo(c);
     obj.setRouteDetail(d);
     obj.setMobileNo(e);
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
    
     session.save(obj);
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();   
   }
 
    //System.out.println(s.getName()+":"+s.getPassword());     
    //  System.out.println("Build Sucessful");
   
              
return true;
    }
public  static List<Detail>  get()
{
     List <Detail> list = null;
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
    Criteria criteria = session.createCriteria(Detail.class);
    //criteria.add(Restrictions.lt("id",a)).add(Restrictions.gt("id",b));
    //criteria.setFirstResult(a);
   // criteria.setMaxResults(b);
   // criteria.addOrder(Order.desc("marks"));
  // criteria.add(Restrictions.eq("busno","9888"));
     list = criteria.list();
     
    
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }
    
   return list;
}
public static void  update(String a,String b ,String c,String d,String e)
{     List <Detail> list = null;
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
 Criteria criteria = session.createCriteria(Detail.class);
  criteria.add(Restrictions.eq("busno",e));
     list = criteria.list();
 int id=0;
   for(Detail obj:list)
  {
 id=obj.getId();
  }  
     
  Detail r=null;
 r = (Detail) session.get(Detail.class, id);
r.setDriverName(a);
r.setLicenseNo(b);
r.setMobileNo(c);
r.setRouteDetail(d);
    
 session.save(r);  
 
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }


  
}

public static void delete(String bus)
{
    List <Detail> list = null;  
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
     Criteria criteria = session.createCriteria(Detail.class);
   criteria.add(Restrictions.eq("busno",bus));
     list = criteria.list();
    int id=0;
   for(Detail obj:list)
  {
 id=obj.getId();
  }   
     Detail emp = (Detail)session.load(Detail.class, id);
     session.delete(emp);
     tx.commit();
     }catch(Exception ex)
     {
      ex.printStackTrace();     
     }finally{
     session.close();
     sf.close();
     }

  
}
public static void main(String args[])
{
   //DetailDao.update("singhalok","1234","4321","a s d f","9888");
   // DetailDao.get1("alok2","123");
    
  
}
}
 