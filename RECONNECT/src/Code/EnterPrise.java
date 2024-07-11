/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Code.Organization.Directory_Organization;
import Code.Organization.Organization;

/**
 *
 * @author pragneshanekal
 */
public abstract class EnterPrise extends Organization {

    private EntType enterprise_type;
    private Directory_Organization orgaDirectory;
    private String Zip;

    public EnterPrise(String Name, EntType type) {

        super(Name);
        this.enterprise_type = type;
        orgaDirectory = new Directory_Organization();

    }

    public enum EntType {

        Hospital("Hospital"),
        Supplier("Supplier"),
        Logistics("Logistics"),
        Pharmacy("Pharmacy"),
        MedicalEquiPantry("MedicalEquipPantry");
        private String value;

        private EntType(String value) {

            this.value = value;

        }

        public String getValue() {
            return value;
        }

        @Override

        public String toString() {

            return value;
        }

    }

    public EntType getEnterprise_type() {
        return enterprise_type;
    }

    /* public void setEnterprise_type(EntType enterprise_type) {
        this.enterprise_type = enterprise_type;
    }*/
    public Directory_Organization getOrgaDirectory() {
        return orgaDirectory;
    }

    /*public void setOrgaDirectory(Directory_Organization orgaDirectory) {
        this.orgaDirectory = orgaDirectory;
    }*/
    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }

}
