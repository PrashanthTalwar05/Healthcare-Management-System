/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.MedicalWasteManagement;

import Code.Account;
import Code.EcoSystem;
import Code.MedicalWaste;
import Code.Organization.Organization;
import Code.Organization.Organization_MedicalWaste;
//import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * JPanel class for managing medical waste in the medical waste management
 * module. Displays a table of medical waste items and provides an option to
 * recycle selected items.
 *
 * @author Milindh R Kashyap
 */
public class ManageMedicalWasteWorkAreaJPanel extends javax.swing.JPanel {

    private Organization_MedicalWaste mw;
    private JPanel panel;
    private Account acc;
    private EcoSystem eco;
    ArrayList<MedicalWaste> list = new ArrayList<>();

    /**
     * Creates new form ManageMedicalWasteWorkAreaJPanel.
     *
     * @param panel The panel where this panel is added.
     * @param eco The ecosystem associated with this panel.
     * @param acc The account associated with this panel.
     * @param o The organization associated with this panel.
     */
    public ManageMedicalWasteWorkAreaJPanel(JPanel panel, EcoSystem eco, Account acc, Organization o) {
        initComponents();
        this.panel = panel;
        this.acc = acc;
        this.eco = eco;
        this.mw = (Organization_MedicalWaste)o ;
        popdData();
    }

    public void popdData() {
        MedicalWaste mw1 = new MedicalWaste();
        mw1.setName("Radioactive Waste");
        mw1.setDays(10);
        mw1.setWeight(20);

        MedicalWaste mw2 = new MedicalWaste();
        mw1.setName("Plastic Waste");
        mw1.setDays(20);
        mw1.setWeight(30);

        MedicalWaste mw3 = new MedicalWaste();
        mw1.setName("Dry Waste");
        mw1.setDays(15);
        mw1.setWeight(10);

        MedicalWaste mw4 = new MedicalWaste();
        mw1.setName("Wet Waste");
        mw1.setDays(2);
        mw1.setWeight(8);

        list.add(mw4);
        list.add(mw3);
        list.add(mw2);
        list.add(mw1);

        DefaultTableModel model = (DefaultTableModel) tblmw.getModel();
        model.setRowCount(0);

        for (MedicalWaste m : list) {
            Object[] row = new Object[3];
            row[0] = m;
            row[1] = m.getWeight();
            row[2] = m.getDays();
            model.addRow(row);
        }

    }

    public void fillRows() {
        DefaultTableModel model = (DefaultTableModel) tblmw.getModel();
        model.setRowCount(0);

        for (MedicalWaste m : list) {
            Object[] row = new Object[3];
            row[0] = m;
            row[1] = m.getWeight();
            row[2] = m.getDays();
            model.addRow(row);
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

        lblMW = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmw = new javax.swing.JTable();
        btnrec = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblMW.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblMW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMW.setText("MANAGE MEDICAL WASTE");

        tblmw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Weight", "Days since cleared"
            }
        ));
        jScrollPane1.setViewportView(tblmw);

        btnrec.setText("Recycle");
        btnrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnrec, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblMW)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnrec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblmw.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblmw.getModel();
        MedicalWaste selectedMW = (MedicalWaste) model.getValueAt(selectedRowIndex, 0);

        list.remove(selectedMW);

        JOptionPane.showMessageDialog(this, "Recycled");

        fillRows();
    }//GEN-LAST:event_btnrecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMW;
    private javax.swing.JTable tblmw;
    // End of variables declaration//GEN-END:variables
}
