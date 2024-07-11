/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author pragneshanekal
 */
public class Doctor {

    private String Name;
    private PrescriptionList presList;

    public Doctor() {

        presList = new PrescriptionList();
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public PrescriptionList getPresList() {
        return presList;
    }

    public void setPresList(PrescriptionList presList) {
        this.presList = presList;
    }

    public String getName() {
        return Name;
    }

}
