/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

/**
 *
 * @author raksh
 */
public class HealthcareEquipmentWorkRequest extends WorkRequest {

    private float actual_price;
    private float loaned_price;
    private String equipment_Name;
    private String expectedArrival_Time;
    private String urgency_Level;
    private String hospita_lName;
    private int quantity_1;
    private String network_1;
    private String transport_requestStatus;

    public float getActualprice() {
        return actual_price;
    }

    public void setActualprice(float actualprice) {
        this.actual_price = actualprice;
    }

    public float getLoanedprice() {
        return loaned_price;
    }

    public void setLoanedprice(float loanedprice) {
        this.loaned_price = loanedprice;
    }

    public String getEquipmentName() {
        return equipment_Name;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipment_Name = equipmentName;
    }

    public String getExpectedArrivalTime() {
        return expectedArrival_Time;
    }

    public void setExpectedArrivalTime(String expectedArrivalTime) {
        this.expectedArrival_Time = expectedArrivalTime;
    }

    public String getUrgencyLevel() {
        return urgency_Level;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgency_Level = urgencyLevel;
    }

    public String getHospitalName() {
        return hospita_lName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospita_lName = hospitalName;
    }

    public int getQuantity() {
        return quantity_1;
    }

    public void setQuantity(int quantity) {
        this.quantity_1 = quantity;
    }

    public String getNetwork() {
        return network_1;
    }

    public void setNetwork(String network) {
        this.network_1 = network;
    }

    public String getTransportrequestStatus() {
        return transport_requestStatus;
    }

    public void setTransportrequestStatus(String transportrequestStatus) {
        this.transport_requestStatus = transportrequestStatus;
    }

    @Override
    public String toString() {
        return this.equipment_Name;
    }

}
