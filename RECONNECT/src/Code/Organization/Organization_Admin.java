/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.Role.Role;
import Code.Role.Role_Admin;
import java.util.ArrayList;

/**
 *
 * @author Milindh R Kashyap
 */
public class Organization_Admin extends Organization {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization_Admin() {
        super(OrganizationType.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Admin());
        return list;
    }
}
