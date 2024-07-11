/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Code.Organization.Organization;
import Code.Role.Role;
import Code.Role.Role_SystemAdmin;
import java.util.ArrayList;

/**
 *
 * @author pragneshanekal
 */
public class EcoSystem extends Organization {

    private ArrayList<Network> networks;

    private static EcoSystem business;

    public static EcoSystem getReferrence() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public EcoSystem() {
        super(null);
        networks = new ArrayList<>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public Network addBuildedNetwork() {
        Network n = new Network();
        networks.add(n);
        return n;
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Role_SystemAdmin());
        return roles;
    }

    public boolean uniqueUserCheck(String u) {

        if (!this.getUserAccDir().uniqueAccountCheck(u)) {
            return false;
        }
        return true;
    }

}
