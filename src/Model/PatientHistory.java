/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 91983
 */
public class PatientHistory {
    
    private ArrayList<Patient> patienthistory;
    
    public ArrayList<Patient> getPatienthistory() {
        return patienthistory;
    }
    public void setPatienthistory(ArrayList<Patient> patienthistory) {
        this.patienthistory= patienthistory;
    }
    
    public PatientHistory(){        
        patienthistory = new  ArrayList<Patient>();
     }
    
     public Patient addNewPatient(){
        Patient patient = new Patient();
        patienthistory.add(patient);
        return patient ; 
    }
   public void deletePatient(Patient doctor){
       patienthistory.remove(doctor);
       
   }
   
   public void updatedPatient(Patient doctor , int rowIndex){
       patienthistory.set(rowIndex,doctor);
   }
}


