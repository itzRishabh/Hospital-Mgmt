/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author 91983
 */
public class PatientHistory {
    private ArrayList<Patient> phistory;
    public PatientHistory(){
        this.phistory= new ArrayList<>();
    }

    public ArrayList<Patient> getHistory() {
        return phistory;
    }

    public void setHistory(ArrayList<Patient> phistory) {
        this.phistory = phistory;
    }
    public Patient addNewPatient(){
        Patient  newPatient = new Patient();
        phistory.add(newPatient);
        return newPatient;
    }

    public void deletePatient(Patient ptn) {
        phistory.remove(ptn);
    }
    public Patient updatedNewEmployee(Patient ptn,int rowIndex){
        phistory.set(rowIndex,ptn);
        return ptn;
    }
    
}
