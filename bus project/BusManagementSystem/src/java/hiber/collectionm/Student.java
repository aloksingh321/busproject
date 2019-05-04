/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.collectionm;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
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


@ElementCollection
private List<String> address = new ArrayList<>();
 
 //@Embedded
//@AttributeOverride(name="city",column=@Column(name="stu_city"))
 
//private hiber.Address address;
Student()
{
    super();
}
Student(int id,String name)
{
    this.id = id;
    this.name= name;
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
   public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }
}

