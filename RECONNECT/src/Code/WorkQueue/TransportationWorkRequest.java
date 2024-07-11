/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

import Code.WorkQueue.WorkRequest;

//import Schema.UserAccount.UserAccount;
/**
 *
 * @author raksh
 */
public class TransportationWorkRequest extends WorkRequest {

    private String Nameofsender;
    private String time;
    private String timezone;
    private String Numberofvehicle;
    private String hospitalName;
    private String text;
    private String urgent;
    private String equipmentinformation;
    private int uniqueIdentity;
    private static int count = 11001;
    private int requestId;

    public String getSenderName() {
        return Nameofsender;
    }

    public void setSenderName(String senderName) {
        this.Nameofsender = senderName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getVehicleNumber() {
        return Numberofvehicle;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.Numberofvehicle = vehicleNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    public String getUrgency() {
        return urgent;
    }

    public void setUrgency(String urgency) {
        this.urgent = urgency;
    }

    public String getEquipmentinfo() {
        return equipmentinformation;
    }

    public void setEquipmentinfo(String equipmentinfo) {
        this.equipmentinformation = equipmentinfo;
    }

    public int getUniqueId() {
        return uniqueIdentity;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueIdentity = uniqueId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TransportationWorkRequest.count = count;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public TransportationWorkRequest() {
        count++;
        uniqueIdentity = count;
    }

    @Override
    public String toString() {
        return this.Nameofsender;
    }

}
