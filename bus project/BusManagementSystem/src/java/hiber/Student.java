/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;

//package hiberannotation;

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
@Table (name="stu")
public class Student {
 @Id

 @GeneratedValue
 private int id;
 
@Column (name="stu_name")
 private String name;
 
 @Embedded
//@AttributeOverride(name="city",column=@Column(name="stu_city"))
 @AttributeOverrides({
 @AttributeOverride(name="city",column=@Column(name="stu_city")),
 @AttributeOverride(name="state",column=@Column(name="stu_state"))
 })
private Address address;

 @Transient
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
    
   public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
