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
public class DrugPantryList {

    private ArrayList<DrugPantry> ListOfDrugs;

    public DrugPantryList() {
        ListOfDrugs = new ArrayList<>();

    }

    public ArrayList<DrugPantry> getListOfDrugs() {
        return ListOfDrugs;
    }

    public void setListOfDrugs(ArrayList<DrugPantry> ListOfDrugs) {
        this.ListOfDrugs = ListOfDrugs;
    }

    public DrugPantry AddDrug() {
        DrugPantry dp = new DrugPantry();
        ListOfDrugs.add(dp);
        return dp;
    }

    public void removeDrug(DrugPantry dp1) {

        ListOfDrugs.remove(dp1);

    }

}
