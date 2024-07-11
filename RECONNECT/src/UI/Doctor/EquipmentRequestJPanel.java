/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Code.Account;
import Code.DocPrescription;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.MedicalEquipPantryEnterPrise;
import Code.Network;
import Code.Organization.Organization;
import Code.Organization.Organization_Doctor;
import Code.Organization.Organization_EquipmentHandling;
import Code.PrescriptionList;
import Code.WorkQueue.DoctorWorkRequest;
import Code.WorkQueue.HealthcareEquipmentWorkRequest;
import Code.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * EquipmentRequestJPanel class represents the user interface for handling
 * medical equipment requests by doctors. It allows doctors to request medical
 * equipment with specified urgency levels and quantities.
 *
 * @author Milindh R Kashyap
 */
public class EquipmentRequestJPanel extends javax.swing.JPanel {

    private DocPrescription docpres;
    private DoctorWorkRequest docreq;
    private EnterPrise enter;
    private Account acc;
    private JPanel upperContainer;
    private Organization_Doctor doctorOrg;
    private PrescriptionList p_list;
    private EcoSystem eco;
    private Network ntk;
    private EnterPrise.EntType enttpe;
    private Organization_EquipmentHandling eqhandle;
    private MedicalEquipPantryEnterPrise medenter;

    /**
     * Creates new form HealthCareEquipmentManagementJpanel.
     *
     * @param upperContainer The JPanel where the user interface will be
     * displayed.
     * @param acc The user account associated with the doctor.
     * @param doctorOrg The organization representing the doctor.
     * @param enter The enterprise the doctor belongs to.
     * @param eco The overall ecosystem.
     * @param ntk The network the doctor is part of.
     */
    public EquipmentRequestJPanel(JPanel upperContainer, Account acc, Organization_Doctor doctorOrg, EnterPrise enter, EcoSystem eco, Network ntk) {
        initComponents();
        this.upperContainer = upperContainer;
        this.acc = acc;
        this.enter = enter;
        this.doctorOrg = doctorOrg;
        this.ntk = ntk;
        this.eco = eco;

        populateWorkTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tblMedEq = new javax.swing.JTable();
        lblUrgency = new javax.swing.JLabel();
        cmbUrgency = new javax.swing.JComboBox();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JSpinner();
        btnBack = new javax.swing.JButton();
        btnReq = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblMedEq = new javax.swing.JLabel();
        cmbEq = new javax.swing.JComboBox();
        btnRef = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        tblMedEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICAL EQUIPMENT", "MESSAGE", "QUANTITY", "STATUS", "REQUEST DATE", "ACTUAL PRICE", "LOAN PRICE"
            }
        ));
        scrollPane.setViewportView(tblMedEq);

        lblUrgency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUrgency.setText("URGENCY LEVEL:");

        cmbUrgency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please select--", "VERY CRITICAL(<2 HRS)", "MODERATE(<5 HRS)", "LOW PRIORITY(24 HRS)" }));
        cmbUrgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUrgencyActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setText("QUANTITY:");

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReq.setBackground(new java.awt.Color(153, 153, 153));
        btnReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RequestService.jpg"))); // NOI18N
        btnReq.setText("Request");
        btnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqActionPerformed(evt);
            }
        });

        lblHeader.setBackground(new java.awt.Color(204, 255, 255));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("REQUEST MEDICAL EQUIPMENT");

        lblMedEq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedEq.setText("MEDICAL EQUIPMENT:");

        cmbEq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Please Select--", "Oxygen Cylinder", "Pulse Oxymeter", "Stretcher", "Thermometer", "Stethescope", "Diabetes Machine", "COVID Testing Kits", "Syringes", "Blood pressure Kit", " " }));
        cmbEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEqActionPerformed(evt);
            }
        });

        btnRef.setBackground(new java.awt.Color(204, 204, 255));
        btnRef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRef.setForeground(new java.awt.Color(204, 204, 255));
        btnRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RefreshImage.jpg"))); // NOI18N
        btnRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnRef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMedEq, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addComponent(btnReq, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(308, 308, 308))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedEq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnReq)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUrgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUrgencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUrgencyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        upperContainer.remove(this);
        CardLayout layout = (CardLayout) upperContainer.getLayout();
        layout.previous(upperContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqActionPerformed
        HealthcareEquipmentWorkRequest request = new HealthcareEquipmentWorkRequest();
        request.setEquipmentName(cmbEq.getSelectedItem().toString());
        request.setSender(acc);
        request.setStatus("Sent");
        request.setUrgencyLevel(cmbUrgency.getSelectedItem().toString());

        request.setQuantity(Integer.parseInt(txtQuantity.getValue().toString()));

        Date date = new Date();
        int min = 20;
        int max = 40;
        Random rand = new Random();

        int n1 = rand.nextInt((max - min)) + 1;
        int n2 = rand.nextInt(10) + 1;

        request.setActualprice(n1);
        request.setHospitalName(enter.getOrgName());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        request.setRequestDate(dateFormat.format(date));
        request.setLoanedprice(n2);
        Organization org = null;
        for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
            if (organization instanceof Organization_Doctor) {
                org = organization;
                System.out.println("****" + org);
                break;
            }
        }
        org.getWQ().getWorkRequestList().add(request);
        acc.getWorkQueue().getWorkRequestList().add(request);
        // equiporg.getWorkQueue().getWorkRequestList().add(request);
        System.out.println("****** " + org.getOrgName());
        System.out.println("******" + enter.getOrgName());
        System.out.println("**** " + ntk.getNetwork_Name());
        for (Network network : eco.getNetworks()) {

        if (ntk.getNetwork_Name().equals(this.ntk.getNetwork_Name())) {
                for (EnterPrise ent : ntk.getDirectoEnterpri().getEnterpList()) {
                    System.out.println("****" + ent.getOrgName());
                    System.out.println("******" + ent.getEnterprise_type());
                    for (Organization organization : ent.getOrgaDirectory().getOrganizations()) {
                        System.out.println("***** Organizatio Name:" + organization.getOrgName());
                        if (organization.getOrgName().equals("Equipment Organization")) {
                            System.out.println("True");
                            System.out.println("***** organization Name" + organization.getOrgName());
                            organization.getWQ().getWorkRequestList().add(request);
                        }
                    }
                }

            }
            acc.getWorkQueue().getWorkRequestList().add(request);
            populateWorkTable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnReqActionPerformed

    private void cmbEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEqActionPerformed

    private void btnRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefActionPerformed

    /**
     * Populates the table displaying healthcare equipment work requests.
     * Retrieves the relevant information from each work request in the doctor's
     * organization and adds a row to the table for each request.
     */
    private void populateWorkTable() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel model = (DefaultTableModel) tblMedEq.getModel();

        model.setRowCount(0);
        for (WorkRequest request : doctorOrg.getWQ().getWorkRequestList()) {
            Object[] row = new Object[9];

            row[0] = ((HealthcareEquipmentWorkRequest) request);
            String urgencyLevel = ((HealthcareEquipmentWorkRequest) request).getUrgencyLevel();
            row[1] = urgencyLevel;
            int quantity = ((HealthcareEquipmentWorkRequest) request).getQuantity();
            row[2] = quantity;
            row[3] = request.getStatus();
            
            String expectedArrivalTime = ((HealthcareEquipmentWorkRequest) request).getExpectedArrivalTime();
            
            row[4] = request.getRequestDate();
            row[5] = ((HealthcareEquipmentWorkRequest) request).getActualprice();

            row[6] = ((HealthcareEquipmentWorkRequest) request).getLoanedprice();
//            row[7] = ((HealthcareEquipmentWorkRequest) request).getActualprice();
//            row[8] = ((HealthcareEquipmentWorkRequest) request).getLoanedprice();

            model.addRow(row);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnReq;
    private javax.swing.JComboBox cmbEq;
    private javax.swing.JComboBox cmbUrgency;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMedEq;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblUrgency;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblMedEq;
    private javax.swing.JSpinner txtQuantity;
    // End of variables declaration//GEN-END:variables

}
