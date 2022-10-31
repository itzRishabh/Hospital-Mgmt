/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Encounters;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author 91983
 */
public class HospitalUpdateEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    boolean validationCheck=true;
    
    public HospitalUpdateEncounter(PatientDirectory patientDirectory, DoctorDirectory doctorDirectory ) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtEncounterDate = new javax.swing.JFormattedTextField();
        lblHospitalName = new javax.swing.JLabel();
        txtHospName = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        btnUpdateEncounter = new javax.swing.JButton();
        lblSearchEncounter = new javax.swing.JLabel();
        txtSearchEncounter = new javax.swing.JTextField();
        btnSearchEncounter = new javax.swing.JButton();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        btnSearchPatient1 = new javax.swing.JButton();
        lblDoctorId = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        btnSearchDoctor = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Encounter");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Date :");

        txtEncounterDate.setEditable(false);
        txtEncounterDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospitalName.setText("Hospital Name :");

        txtHospName.setEditable(false);
        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodPressure.setText("Blood Pressure :");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPulse.setText("Pulse :");

        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWeight.setText("Temperature :");

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        btnUpdateEncounter.setText("Update Encounter");
        btnUpdateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncounterActionPerformed(evt);
            }
        });

        lblSearchEncounter.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchEncounter.setText("Search Encounter by ID:");

        txtSearchEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEncounterActionPerformed(evt);
            }
        });

        btnSearchEncounter.setText("Search");
        btnSearchEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEncounterActionPerformed(evt);
            }
        });

        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatientId.setText("Patient ID :");

        txtPatientId.setEditable(false);
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        btnSearchPatient1.setText("Search Patient");
        btnSearchPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatient1ActionPerformed(evt);
            }
        });

        lblDoctorId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDoctorId.setText("Doctor ID :");

        txtDoctorId.setEditable(false);
        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });

        btnSearchDoctor.setText("Search Doctor");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPulse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUpdateEncounter)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPulse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospName)
                            .addComponent(txtBloodPressure)
                            .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPatientId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDoctorId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEncounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchEncounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(btnSearchPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateEncounter)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void btnUpdateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncounterActionPerformed
        // TODO add your handling code here:

        try{
            
            if(checkForNullorEmptyValue()){
            
                if(RegexValidation()){
                    
                    int encounterId = Integer.parseInt(txtSearchEncounter.getText());
                    Encounter encounter=new Encounter();
                    for(Patient patient:patientDirectory.getPatients())
                    {
                        if(patient.getPatientHistoryMap().containsKey(Integer.parseInt(txtPatientId.getText())))
                        {
                            var a = patient.getPatientHistoryMap().get(Integer.parseInt(txtPatientId.getText()));
                            for (Encounter en : a.getPatientEncounterHistory())
                            {

                                if(encounterId == en.getEncounterId()){

                                    VitalSigns vitalSigns=new VitalSigns();
                                    vitalSigns.setBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
                                    vitalSigns.setPulse(Integer.parseInt(txtPulse.getText()));
                                    vitalSigns.setTemperature(Integer.parseInt(txtTemperature.getText()));
                                    vitalSigns.setDateOfVitals(new Date());

                                    String encDate = txtEncounterDate.getText();
                                    Map<Date,VitalSigns> patientEncounter=new HashMap<>();
                                    Date encounterDate;  
                                    try {
                                        encounterDate = new SimpleDateFormat("MM/dd/yyyy").parse(encDate);
                                        patientEncounter.put(encounterDate,vitalSigns);

                                    } catch (ParseException ex) {
                                        System.out.print("Exception");
                                    }
                                    encounter = en;
                                    encounter.setPatientEncounter(patientEncounter);


                                }


                            }
                            var patientLastVisitEncounter=a.getPatientEncounterHistory().size()-1;
                            a.getPatientEncounterHistory().set(patientLastVisitEncounter, encounter);
                        }
                    }
                    JOptionPane.showMessageDialog(this,"Encounter Updated Succesfully");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Validation Failed .Please hover over red field to know more");
                    validationCheck=true;
                }
            
            }else{
                JOptionPane.showMessageDialog(this,"Validation Failed .Please hover over red field to know more");
                    validationCheck=true;
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured.Encounter Could not be made");
        }
    }//GEN-LAST:event_btnUpdateEncounterActionPerformed

    private void txtSearchEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEncounterActionPerformed

    private void btnSearchEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEncounterActionPerformed
        // TODO add your handling code here:
        
        
        int encounterIdInput = Integer.parseInt(txtSearchEncounter.getText());

        for(Patient patient: patientDirectory.getPatients()){
            
            int patientId=0;
            int doctorId =0;
            String encounterDate = null;
            String dateOfVitals = null;
            String patientName= patient.getName();
                    
            int bloodpressure = 0;
            int pulse =0;
            int temperature =0;
            
             for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatientHistoryMap().entrySet()){
             
                 patientId= pair.getKey();     
                 ArrayList<Encounter> encounters = pair.getValue().getPatientEncounterHistory();
             
                 for(Encounter e: encounters){
                     
                     if(encounterIdInput == e.getEncounterId()){
                         
                            VitalSigns vitalSigns = null;  
                            doctorId = e.getDoctorId();
                            Map<Date, VitalSigns> vitalSignMap = e.getPatientEncounter();
                            
                            for(Map.Entry m: vitalSignMap.entrySet()){
                                
                                try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                    encounterDate = simpleDateFormat.format((Date)m.getKey());
                                } catch (Exception ex) {
                                    System.out.println("Date is null");
                                    System.out.println(ex);
                                }
                                    vitalSigns = (VitalSigns) m.getValue();
                                }
                            
                                try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                    dateOfVitals = simpleDateFormat.format(vitalSigns.getDateOfVitals());

                                } catch (Exception ex) {
                                   System.out.println("Date is null");
                                }
                                bloodpressure = vitalSigns.getBloodPressure();
                                pulse = vitalSigns.getPulse();
                                temperature = vitalSigns.getTemperature();
                                
                                txtEncounterDate.setText(encounterDate);
                                txtHospName.setText("Dummy Hosps");
                                txtPatientId.setText(String.valueOf(patientId));
                                txtDoctorId.setText(String.valueOf(doctorId));
                                txtBloodPressure.setText(String.valueOf(bloodpressure));
                                txtPulse.setText(String.valueOf(pulse));
                                txtTemperature.setText(String.valueOf(temperature));
                           
                     }
                 
                 }
             
             }
        }
    }//GEN-LAST:event_btnSearchEncounterActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnSearchPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatient1ActionPerformed
        // TODO add your handling code here:

        if(txtPatientId.getText().trim().isEmpty()|| txtPatientId.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Patient Id");
            return;
        }
        boolean patientAvailable=false;
        for(var patient : patientDirectory.getPatients())
        {
            if(patient.getPatientId()==Integer.parseInt(txtPatientId.getText()))
            {
                patientAvailable=true;
            }
        }
        if(!patientAvailable)
        {
            JOptionPane.showMessageDialog(this,"Patient does not exist ."
                + "Please register before making an Appointment");
        }
        if(patientAvailable)
        {
            JOptionPane.showMessageDialog(this,"Patient exist .");
        }
    }//GEN-LAST:event_btnSearchPatient1ActionPerformed

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here:

        if(txtDoctorId.getText().trim().isEmpty()|| txtDoctorId.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Doctor Id");
            return;
        }
        boolean doctorAvailable=false;
        for(var doctor : doctorDirectory.getDoctors())
        {
            if(doctor.getDoctorId()==Integer.parseInt(txtDoctorId.getText()))
            {
                doctorAvailable=true;
            }
        }
        if(!doctorAvailable)
        {
            JOptionPane.showMessageDialog(this,"Doctor does not exist ."
                + "Please register before making an Appointment");
        }
        if(doctorAvailable)
        {
            JOptionPane.showMessageDialog(this,"Doctor exist .");
        }

    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private boolean RegexValidation() throws ParseException {
        
        if(!txtEncounterDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$")){
            txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEncounterDate.setToolTipText("Please enter date in format mm/dd/yyyy");
            validationCheck=false;
        }
        
        if(txtEncounterDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$"))
        {
            txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Pleae enter a valid Blood Pressure");
            validationCheck=false;
        }
        if(txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(!txtPulse.getText().matches("\\b\\d+\\b"))
        {
            txtPulse.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulse.setToolTipText("Pleae enter a valid Pulse Rate");
            validationCheck=false;
        }
        if(txtPulse.getText().matches("\\b\\d+\\b"))
        {
            txtPulse.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtTemperature.getText().matches("^(8[0-9]|9[0-9]|10[0-9]|110)$"))
        {
            txtTemperature.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtTemperature.setToolTipText("Pleae enter a valid body temperature");
            validationCheck=false;
        }
        if(txtTemperature.getText().matches("^(8[0-9]|9[0-9]|10[0-9]|110)$"))
        {
            txtTemperature.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return validationCheck;
    }
    
    private boolean checkForNullorEmptyValue() {
       if(txtEncounterDate.getText()==(null))
       {
           txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEncounterDate.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(txtEncounterDate.getText()!=(null))
       {
           txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtHospName.getText()==(null))
       {
           txtHospName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospName.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(txtHospName.getText()!=(null))
       {
           txtHospName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtPatientId.getText().equals(null) || txtPatientId.getText().isEmpty())
       {
           txtPatientId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPatientId.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtPatientId.getText().equals(null) && !txtPatientId.getText().isEmpty())
       {
           txtPatientId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtDoctorId.getText().equals(null) || txtDoctorId.getText().isEmpty())
       {
           txtDoctorId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDoctorId.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtDoctorId.getText().equals(null) && !txtDoctorId.getText().isEmpty())
       {
           txtDoctorId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
   
       
       if(txtPulse.getText().equals(null) || txtPulse.getText().isEmpty())
       {
           txtPulse.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulse.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtPulse.getText().equals(null) && !txtPulse.getText().isEmpty())
       {
           txtPulse.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
       }
       
       if(txtBloodPressure.getText().equals(null) || txtBloodPressure.getText().isEmpty())
       {
           txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtBloodPressure.getText().equals(null) && !txtBloodPressure.getText().isEmpty())
       {
           txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            
       }
       
       if(txtTemperature.getText().equals(null) || txtTemperature.getText().isEmpty())
       {
           txtTemperature.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtTemperature.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtTemperature.getText().equals(null) && !txtTemperature.getText().isEmpty())
       {
           txtTemperature.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            
       }
       
       return validationCheck;
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnSearchEncounter;
    private javax.swing.JButton btnSearchPatient1;
    private javax.swing.JButton btnUpdateEncounter;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblSearchEncounter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JFormattedTextField txtEncounterDate;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtSearchEncounter;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
