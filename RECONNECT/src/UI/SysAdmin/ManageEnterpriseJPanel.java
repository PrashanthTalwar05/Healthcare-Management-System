/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SysAdmin;

import Code.Directory_Address;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * JPanel class for managing enterprises. Allows the system administrator to add
 * new enterprises. Displays a table of existing enterprises.
 *
 * @author Milindh R Kashyap
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel upperConatiner;
    private EcoSystem eco;
    private Directory_Address addresslist;

    /**
     * Creates new form ManageEnterpriseJPanel.
     *
     * @param userContainer The panel where the user interface is managed.
     * @param eco The ecosystem containing networks, enterprises, and address
     * information.
     */
    public ManageEnterpriseJPanel(JPanel userContainer, EcoSystem eco) {
        initComponents();
        this.upperConatiner = userContainer;
        this.eco = eco;
        addresslist = new Directory_Address();
        populateTable();
        populateComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkLbl = new javax.swing.JLabel();
        CmbNetk = new javax.swing.JComboBox();
        enterprisetypeLbl = new javax.swing.JLabel();
        CombEnterprise = new javax.swing.JComboBox();
        nameLbl = new javax.swing.JLabel();
        textf1 = new javax.swing.JTextField();
        BtnBack = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        MainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));

        networkLbl.setText("Network:");

        CmbNetk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterprisetypeLbl.setText("Enterprise Type:");

        CombEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nameLbl.setText("Name:");

        textf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf1ActionPerformed(evt);
            }
        });

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RequestService.jpg"))); // NOI18N
        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        MainLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLabel.setText("Manage Enterprise");

        nameTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(nameTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(networkLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enterprisetypeLbl)
                                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CombEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CmbNetk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textf1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(BtnSubmit)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainLabel)
                .addGap(19, 19, 19)
                .addComponent(BtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbNetk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterprisetypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CombEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnSubmit)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf1ActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        upperConatiner.remove(this);
        Component[] cmpArray = upperConatiner.getComponents();
        Component component = cmpArray[cmpArray.length - 1];
        SysAdminWorkAreaJPanel sysAdmin = (SysAdminWorkAreaJPanel) component;
        sysAdmin.populateTreewithData();
        CardLayout crd = (CardLayout) upperConatiner.getLayout();
        crd.previous(upperConatiner);// TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        Network network = (Network) CmbNetk.getSelectedItem();
        EnterPrise.EntType type = (EnterPrise.EntType) CombEnterprise.getSelectedItem();
        System.out.println(CombEnterprise.getSelectedItem());
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        String name = textf1.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the input");
            return;
        }

        for (EnterPrise e : network.getDirectoEnterpri().getEnterpList()) {
            if (e.getOrgName().equals(name)) {
                JOptionPane.showMessageDialog(this, "Enterprise name already exists.Please select a different name.");
                return;
            }
        }
        EnterPrise enterprise = network.getDirectoEnterpri().AddEnterPrise(name, type);
        Code.Address adr = addresslist.insertAddress();
// adr address doesnot hace setEnterprise
        adr.setName(textf1.getText());

        populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox CmbNetk;
    private javax.swing.JComboBox CombEnterprise;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JLabel enterprisetypeLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable nameTbl;
    private javax.swing.JLabel networkLbl;
    private javax.swing.JTextField textf1;
    // End of variables declaration//GEN-END:variables

    /**
     * Populates the table with existing enterprises.
     */
    private void populateTable() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) nameTbl.getModel();
        model.setRowCount(0);
        for (Network ntw : eco.getNetworks()) {
            for (EnterPrise ent : ntw.getDirectoEnterpri().getEnterpList()) {
                Object[] row = new Object[4];
                row[0] = ent.getOrgName();
                row[1] = ntw.getNetwork_Name();
                row[2] = ent.getEnterprise_type().getValue();
                row[3] = ent.getZip();
                model.addRow(row);
            }
        }

    }

    /**
     * Populates the network and enterprise combo boxes with available options.
     */
    private void populateComboBox() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CmbNetk.removeAllItems();
        CombEnterprise.removeAllItems();
        for (Network ntw : eco.getNetworks()) {
            CmbNetk.addItem(ntw);
        }
        for (EnterPrise.EntType type : EnterPrise.EntType.values()) {
            CombEnterprise.addItem(type);
        }
    }
}
