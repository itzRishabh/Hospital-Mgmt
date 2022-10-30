/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 91983
 */
public class Doctor {
    private String Name;
    private String Age;
    private String Gender;
    private String City;
    private String PhoneNumber ;
    private String HospName;
    private String DocId;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getHospName() {
        return HospName;
    }

    public void setHospName(String HospName) {
        this.HospName = HospName;
    }

    public String getDocId() {
        return DocId;
    }

    public void setDocId(String DocId) {
        this.DocId = DocId;
    }
    @Override
    public String toString(){
        return Name;
    }
}
