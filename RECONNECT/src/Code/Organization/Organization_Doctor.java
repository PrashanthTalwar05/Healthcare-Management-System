/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Organization;

import Code.DocPrescription;
import Code.Role.Role;
import Code.Role.Role_Doctor;
import java.util.ArrayList;

/**
 *
 * @author Milindh R Kashyap
 */
public class Organization_Doctor extends Organization {

    private ArrayList<DocPrescription> prescriptions;

    public Organization_Doctor() {
        super(Organization.OrganizationType.Doctor.getValue());
        prescriptions = new ArrayList<DocPrescription>();
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Doctor());
        return list;
    }

    public ArrayList<DocPrescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<DocPrescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void addPrescription(DocPrescription p) {
        prescriptions.add(p);
    }
}
