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
public class ShipmentDetails {

    private String Dunit;
    private String DStatus;
    private String drug_Name;
    private int quantity;
    private String SerialNo;
    private Date Mfg_Date;
    private Date Exp_Date;

    public String getDunit() {
        return Dunit;
    }

    public void setDunit(String Dunit) {
        this.Dunit = Dunit;
    }

    public String getDStatus() {
        return DStatus;
    }

    public void setDStatus(String DStatus) {
        this.DStatus = DStatus;
    }

    public String getDrug_Name() {
        return drug_Name;
    }

    public void setDrug_Name(String drug_Name) {
        this.drug_Name = drug_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    public Date getMfg_Date() {
        return Mfg_Date;
    }

    public void setMfg_Date(Date Mfg_Date) {
        this.Mfg_Date = Mfg_Date;
    }

    public Date getExp_Date() {
        return Exp_Date;
    }

    public void setExp_Date(Date Exp_Date) {
        this.Exp_Date = Exp_Date;
    }

}
