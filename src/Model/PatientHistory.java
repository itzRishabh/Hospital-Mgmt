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
    private ArrayList<Patient> ptnhistory;

    public ArrayList<Patient> getPatientHistory() {
        return ptnhistory;
    }

    public void setPatientHistory(ArrayList<Patient> ptnhistory) {
        this.ptnhistory = ptnhistory;
    }
    
    public PatientHistory(){        
        ptnhistory = new  ArrayList<Patient>();
     }
   
    
    public Patient addNewPatient(){
        Patient patient = new Patient();
        ptnhistory.add(patient);
        return patient; 
    }
   public void deletePatient(Patient patient){
       ptnhistory.remove(patient);
       
   }
   
   public void updatePatient(Patient patient , int rowIndex){
       ptnhistory.set(rowIndex,patient);
   }

    
}
