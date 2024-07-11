/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.ArrayList;

/**
 *
 * @author pragneshanekal
 */
public class Directory_EnterPrise {

    private ArrayList<EnterPrise> enterpList;

    public Directory_EnterPrise() {

        enterpList = new ArrayList<>();

    }

    public ArrayList<EnterPrise> getEnterpList() {
        return enterpList;
    }

    public EnterPrise AddEnterPrise(String name, EnterPrise.EntType type) {
        EnterPrise enterprise = null;
        if (type == EnterPrise.EntType.Hospital) {
            enterprise = new HospitalEnterPrise(name);
            enterpList.add(enterprise);
        } else if (type == EnterPrise.EntType.Supplier) {
            enterprise = new WholesaleEnterPrise(name);
            enterpList.add(enterprise);

        } else if (type == EnterPrise.EntType.Logistics) {
            enterprise = new WholesaleEnterPrise(name);
            enterpList.add(enterprise);
        } else if (type == EnterPrise.EntType.MedicalEquiPantry) {
            enterprise = new MedicalEquipPantryEnterPrise(name);
            enterpList.add(enterprise);
        } else if (type == EnterPrise.EntType.Pharmacy) {
            enterprise = new DrugEnterprise(name);
            enterpList.add(enterprise);
        }

        return enterprise;
    }

}
