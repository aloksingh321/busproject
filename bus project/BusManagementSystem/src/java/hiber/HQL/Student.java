/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.HQL;

//package hiberannotation;

import hiber.*;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



/**
 *
 * @author ALOK SINGH
 */
@Entity
@Table (name="student1")
public class Student {
 @Id

 @GeneratedValue
 private int id;
 
@Column (name="stu_name")
 private String name;

// @Transient
 private int marks;
Student()
{
    super();
}
Student(int id,String name,int marks)
{
    this.id = id;
    this.name= name;
    this.marks = marks;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
 @Override
  public String toString()
  {
   return id+"name:- "+name+"marks:- "+marks ;  
  }
    
}
