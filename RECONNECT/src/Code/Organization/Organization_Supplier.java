/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.Role.Role;
import Code.Role.Role_Supplier;
import java.util.ArrayList;

/**
 *
 * @author Milindh R Kashyap
 */
public class Organization_Supplier extends Organization {

    public Organization_Supplier() {
        super(Organization.OrganizationType.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Supplier());
        return list;
    }
}
