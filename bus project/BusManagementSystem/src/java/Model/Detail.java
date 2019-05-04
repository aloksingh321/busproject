/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ALOK SINGH
 */
@Entity
@Table (name="Detail")
public class Detail {
    @Id
    @GeneratedValue
  private int id;        
  private String busno;
  private  String DriverName;
   private String  LicenseNo;
   private String RouteDetail;
  private String  MobileNo;
   
 
 
 
   public Detail()
   {
     super();  
   }
    public Detail(String busno, String DriverName, String LicenseNo, String RouteDetail, String MobileNo) {
        this.busno = busno;
        this.DriverName = DriverName;
        this.LicenseNo = LicenseNo;
        this.RouteDetail = RouteDetail;
        this.MobileNo = MobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public String getRouteDetail() {
        return RouteDetail;
    }

    public void setRouteDetail(String RouteDetail) {
        this.RouteDetail = RouteDetail;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }
   public String toString()
   {
    return this.id+" "+this.busno+" "+this.DriverName+" "+this.LicenseNo+" "+this.MobileNo+" "+this.RouteDetail;   
   }
    
}
