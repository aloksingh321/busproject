/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;
import javax.persistence.Id;

/**
 *
 * @author ALOK SINGH
 */
public class User {
    
    private String name;
    private String password;
    private String Email;
      @Id
     private String ID;
    
   
    User(){}
    
    
    User(String name,String password,String Email,String ID)
    {
        this.name = name;
        this.password = password;
        this.Email=Email;
        this.ID=ID;
    } 

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
     
    @Override
   public boolean equals(Object o)
   {
       User u= (User) o;
       if(name.equals(u.getName())&& password.equals(u.getPassword()))
       {
           
           return true;
       }
       return false;
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.password);
        return hash;
    }
    @Override
   public  String  toString()
   {
       return "Name"+name+"password"+password;
   }
}


//this class called pojo classes (plain old java object)