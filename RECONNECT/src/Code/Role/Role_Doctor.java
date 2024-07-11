/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import Code.Account;
import Code.EcoSystem;
import Code.EnterPrise;
import javax.swing.JPanel;
import Code.Network;
import Code.Organization.Organization;
import Code.Organization.Organization_Doctor;
import UI.Doctor.DoctorDashboardJPanel;

/**
 *
 * @author raksh
 */
public class Role_Doctor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network) {
        return new DoctorDashboardJPanel(userProcessContainer, account, (Organization_Doctor) organization, enterprise, business, network);
    }

    @Override
    public String toString() {
        return "Doctor Role";
    }
}
