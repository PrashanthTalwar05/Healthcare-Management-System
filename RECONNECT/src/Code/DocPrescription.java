/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.Date;

/**
 *
 * @author pragneshanekal
 */
public class DocPrescription {

    private String Diagnosis;
    private int frequency_day;
    private int total_days;
    private String Drug;
    private Date Dategiven;
    private String Name_Netk;

    public Date getDategiven() {
        return Dategiven;
    }

    public void setDategiven(Date Dategiven) {
        this.Dategiven = Dategiven;
    }

    public String getName_Netk() {
        return Name_Netk;
    }

    public void setName_Netk(String Name_Netk) {
        this.Name_Netk = Name_Netk;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public int getFrequency_day() {
        return frequency_day;
    }

    public void setFrequency_day(int frequency_day) {
        this.frequency_day = frequency_day;
    }

    public int getTotal_days() {
        return total_days;
    }

    public void setTotal_days(int total_days) {
        this.total_days = total_days;
    }

    public String getDrug() {
        return Drug;
    }

    public void setDrug(String Drug) {
        this.Drug = Drug;
    }

}
