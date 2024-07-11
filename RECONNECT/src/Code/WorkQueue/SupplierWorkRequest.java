/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

/**
 *
 * @author raksh
 */
public class SupplierWorkRequest extends WorkRequest {

    private String medsName;
    private int Quantity;
    private String deliveryTime;

    public String getMedicationName() {
        return medsName;
    }

    public void setMedicationName(String medicationName) {
        this.medsName = medicationName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return this.medsName;
    }

}
