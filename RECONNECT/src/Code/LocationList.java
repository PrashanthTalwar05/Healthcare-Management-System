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
public class LocationList {

    private ArrayList<Location> addresslist;
    ArrayList<Location> Delivery_Locations;

    public LocationList() {

        addresslist = new ArrayList();

    }

    public ArrayList<Location> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(ArrayList<Location> addresslist) {
        this.addresslist = addresslist;
    }

    public ArrayList<Location> getDelivery_Locations() {
        return Delivery_Locations;
    }

    public void setDelivery_Locations(ArrayList<Location> Delivery_Locations) {
        this.Delivery_Locations = Delivery_Locations;
    }

    public Location AddLocation() {

        Location l = new Location();
        addresslist.add(l);
        return l;
    }

    public ArrayList<Location> searchLocation(String pincode) {

        Delivery_Locations = new ArrayList();
        for (Location l1 : addresslist) {

            if (l1.getZipCode().equals(pincode)) {

                Delivery_Locations.add(l1);
                return Delivery_Locations;
            }

        }
        return null;

    }

}
