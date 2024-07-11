/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

//import Code.UserAccount.UserAccount;
/**
 *
 * @author raksh
 */
import Code.Account;
import java.util.Date;

public class DoctorWorkRequest {

    private Account send;
    private Account receive;
    private String medication_Name;
    private String patient_Name;
    private String hospital_Name;
    private String status_;
    private Date request_Date;
    private int Quantity_1;

    public Account getSender() {
        return send;
    }

    public void setSender(Account sender) {
        this.send = sender;
    }

    public Account getReceiver() {
        return receive;
    }

    public void setReceiver(Account receiver) {
        this.receive = receiver;
    }

    public String getMedicationName() {
        return medication_Name;
    }

    public void setMedicationName(String medicationName) {
        this.medication_Name = medicationName;
    }

    public String getPatientName() {
        return patient_Name;
    }

    public void setPatientName(String patientName) {
        this.patient_Name = patientName;
    }

    public String getHospitalName() {
        return hospital_Name;
    }

    public void setHospitalName(String hospitalName) {
        this.hospital_Name = hospitalName;
    }

    public String getStatus() {
        return status_;
    }

    public void setStatus(String status) {
        this.status_ = status;
    }

    public Date getRequestDate() {
        return request_Date;
    }

    public void setRequestDate(Date requestDate) {
        this.request_Date = requestDate;
    }

    public int getQuantity() {
        return Quantity_1;
    }

    public void setQuantity(int Quantity) {
        this.Quantity_1 = Quantity;
    }

    public DoctorWorkRequest() {
        request_Date = new Date();
    }

}
