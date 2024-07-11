/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.DrugPantry;
import Code.Role.Role;
import Code.Role.Role_Pharmacist;
import java.util.ArrayList;

/**
 *
 * @author Milindh R Kashyap
 */
public class Organization_Pharmacy extends Organization {

    private ArrayList<DrugPantry> drugs;

    public Organization_Pharmacy() {
        super(Organization.OrganizationType.Pharmacy.getValue());
        drugs = new ArrayList<DrugPantry>();
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Pharmacist());
        return list;
    }

    public ArrayList<DrugPantry> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<DrugPantry> drugs) {
        this.drugs = drugs;
    }

    public void addDrug(DrugPantry d) {
        drugs.add(d);
    }
}
