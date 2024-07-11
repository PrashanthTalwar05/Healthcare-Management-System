/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.Role.Role;
import Code.Role.Role_Doctor;
import Code.Role.Role_Staff;
import Code.Staff;
import java.util.ArrayList;

/**
 *
 * @author Milindh R Kashyap
 */
public class Organization_Consultancy extends Organization {

    private ArrayList<Staff> Sttaf_list;

    public Organization_Consultancy() {
        super(Organization.OrganizationType.Staff.getValue());
        Sttaf_list = new ArrayList();
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Staff());
        return list;
    }

}
