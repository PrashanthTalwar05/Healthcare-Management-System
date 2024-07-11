/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Role;

import Code.Account;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization;
import UI.Admin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raksh
 */
public class Role_Admin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public String toString() {
        return "Admin Role";
    }
}
