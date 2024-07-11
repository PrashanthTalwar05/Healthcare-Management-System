/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Code.Organization.Directory_Organization;
import Code.Organization.Organization;
import Code.Organization.Organization.OrganizationType;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Milindh R Kashyap
 */
public class OrganizationWorkAreaJPanel extends javax.swing.JPanel {
    
    private Directory_Organization od;
    private JPanel panel;

    /**
     * Creates new form ManagePanel_Account
     */
    public OrganizationWorkAreaJPanel(JPanel panel, Directory_Organization od) {
        initComponents();
        this.panel = panel;
        this.od = od;

        fillRows();
        fillCmb();
    }
    
    private void fillRows() {
        DefaultTableModel m = (DefaultTableModel) tblOrg.getModel();

        m.setRowCount(0);

        for (Organization o : od.getOrganizations()) {
            Object[] r = new Object[2];
            r[0] = o.getOrgId();
            r[1] = o.getOrgName();

            m.addRow(r);
        }
    }

    private void fillCmb() {
        cmbOrg.removeAllItems();
        for (OrganizationType t : Organization.OrganizationType.values()) {
            if (!OrganizationType.Admin.getValue().equals(t.getValue())) {
                cmbOrg.addItem(t);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnCreateOrg = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();
        cmbOrg = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateOrg.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateOrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        btnCreateOrg.setText("Add Organization");
        btnCreateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrgActionPerformed(evt);
            }
        });

        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(tblOrg);

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Organization");

        lblOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrg.setText("Organization Type:");

        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(lblOrg)
                        .addGap(34, 34, 34)
                        .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(btnCreateOrg)))))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrg)
                    .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateOrg)
                .addContainerGap(331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        panel.remove(this);
        CardLayout crd = (CardLayout) panel.getLayout();
        crd.previous(panel); // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrgActionPerformed
        OrganizationType t = (OrganizationType) cmbOrg.getSelectedItem();
        od.addOrg(t);
        fillRows();  // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrg;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblOrg;
    // End of variables declaration//GEN-END:variables
}
