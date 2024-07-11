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
import UI.SysAdmin.SysAdminWorkAreaJPanel;

/**
 *
 * @author raksh
 */
public class Role_SystemAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem system, Network network) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system);
    }

    @Override
    public String toString() {
        return "Sys Admin Role";
    }
}
