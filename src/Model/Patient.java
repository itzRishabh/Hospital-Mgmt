/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
    
import java.util.Date;

/**
 *
 * @author 91983
 */
public class Patient {
    private String name;
    private int age;
    private String gender;
    private String city;
    private String contact;
    private Date aptdate;
    private String selpatient;
    private String seldoctor;
    
    
    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public Date getaptdate() {
        return aptdate;
    }

    public void setaptdate(Date aptdate) {
        this.aptdate = aptdate;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    public String getselpatient() {
        return selpatient;
    }

    public void setselpatient(String selpatient) {
        this.selpatient = selpatient;
    }

    public String getseldoctor() {
        return seldoctor;
    }

    public void setseldoctor(String seldoctor) {
        this.seldoctor = seldoctor;
    }
    

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
