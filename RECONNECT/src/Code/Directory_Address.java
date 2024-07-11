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
public class Directory_Address {

    private ArrayList<Address> addDir;
    ArrayList<Address> viewAddDir;

    public Directory_Address() {
        addDir = new ArrayList<>();
    }

    public ArrayList<Address> getAddDir() {
        return addDir;
    }

    public void setAddDir(ArrayList<Address> addDir) {
        this.addDir = addDir;
    }

    public ArrayList<Address> getViewAddDir() {
        return viewAddDir;
    }

    public void setViewAddDir(ArrayList<Address> viewAddDir) {
        this.viewAddDir = viewAddDir;
    }

    public Address insertAddress() {
        Address add = new Address();
        addDir.add(add);
        return add;
    }

    public ArrayList<Address> findAddress(String zip) {
        viewAddDir = new ArrayList<>();
        for (Address a : addDir) {
            if (a.getPincode().equals(zip)) {
                viewAddDir.add(a);
                return viewAddDir;
            }
        }
        return null;
    }
}
