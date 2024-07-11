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
import UI.LogisticsManagement.TransportationWorkAreaJPanel;

/**
 *
 * @author raksh
 */
public class Role_Transportation extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network) {
        return new TransportationWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

    @Override
    public String toString() {
        return "Transportation Role";
    }
}
