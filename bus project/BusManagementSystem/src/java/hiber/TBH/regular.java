/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.TBH;

import hiber.TBH.Emp;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author ALOK SINGH
 */
@Entity
@DiscriminatorColumn(name="type")
@DiscriminatorValue(value="regular" )
public class regular extends Emp {
 private int salary ;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

 
}
