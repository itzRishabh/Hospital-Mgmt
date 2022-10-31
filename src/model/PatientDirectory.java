/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 91983
 */
public class PatientDirectory {
    
    private Set<Patient> patients = new HashSet<>();
    
    public PatientDirectory() {
       House house = new House();
       Community community = new Community();
                    
       house.setHouseNum(104);
       house.setStreet("Ward Street");
                    
       Map<String,String>communities=new HashMap<>();
       communities.put("Boston","Northeastern University");
       community.setCommunity(communities);
       house.setCommunity(community);
        
        Patient patient=new Patient("Babloo",Long.parseLong("88793835460"),"bablooSingh@gmail.com",22,"Male",house,2554,Float.parseFloat("6.5"),89,"123");
        EncounterHistory encounterHistory=new EncounterHistory();
        Encounter encounter=new Encounter();
        
        VitalSigns vitalSign_1=new VitalSigns();
        vitalSign_1.setBloodPressure(100);
        vitalSign_1.setPulse(50);
        vitalSign_1.setTemperature(102);
        vitalSign_1.setDateOfVitals(new Date());
        
        VitalSigns vitalSigns_2=new VitalSigns();
        vitalSigns_2.setBloodPressure(130);
        vitalSigns_2.setPulse(80);
        vitalSigns_2.setTemperature(105);
        vitalSigns_2.setDateOfVitals(new Date());  
        
        Map<Date,VitalSigns> EncounterMap=new HashMap<>();
        
        EncounterMap.put(new Date(), vitalSign_1);
        encounter.setPatientEncounter(EncounterMap);
        
        EncounterMap.put(new Date(), vitalSigns_2);
        encounter.setPatientEncounter(EncounterMap);
        encounter.setEncounterId(1224);
        encounter.setDoctorId(1001);
        
        encounterHistory.setPatientEncounterHistory(encounter);
        Map<Integer,EncounterHistory> encounterHistoryMapping =new HashMap<>();
        encounterHistoryMapping.put(2554, encounterHistory);
//       patient.setEncounterHistory(encounterHistory);
        patient.setPatientHistoryMap(encounterHistoryMapping);
        patients.add(patient);
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
    
    public void addNewPatient(Person patient)
    {
        patients.add((Patient) patient);
    }  
    
    public Patient getPatientById(int patientId){
        
        Patient patient = null;
        for(Patient p: patients){
            if(patientId == p.getPatientId()){
                return p;
            }
        }
       return patient;
    }

    public void deletePatient(Patient selectedPatient) {
        patients.remove(selectedPatient);
    }
    
}
