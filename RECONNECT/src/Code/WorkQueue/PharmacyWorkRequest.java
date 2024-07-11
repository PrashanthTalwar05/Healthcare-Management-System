/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

import java.util.Date;

/**
 *
 * @author raksh
 */
public class PharmacyWorkRequest extends WorkRequest {

    private String reqDate;
    private String status;
    private String medsName;
    private int Quantity;
    private String network;
    private String suppliersName;

    public String getRequestDate() {
        return reqDate;
    }

    public void setRequestDate(String requestDate) {
        this.reqDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getSupplierName() {
        return suppliersName;
    }

    public void setSupplierName(String supplierName) {
        this.suppliersName = supplierName;
    }

    @Override
    public String toString() {
        return this.medsName;
    }
}
