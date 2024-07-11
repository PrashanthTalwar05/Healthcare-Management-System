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
public class Shipment_List {

    private ArrayList<ShipmentDetails> OrderList;

    public Shipment_List() {

        OrderList = new ArrayList();

    }

    public ArrayList<ShipmentDetails> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<ShipmentDetails> OrderList) {
        this.OrderList = OrderList;
    }

    public ShipmentDetails addOrder() {

        ShipmentDetails sd = new ShipmentDetails();
        OrderList.add(sd);
        return sd;

    }

}
