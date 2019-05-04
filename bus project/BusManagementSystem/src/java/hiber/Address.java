/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ALOK SINGH
 */
@Embeddable
public class Address {
  @Column(name="mycity")
  private String city;
  @Column(name="mystate")
  private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
  
}
