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
public class DrugPantry {

    private String drugName;
    private int item_id;
    private int serialNo;
    private String Category;
    private int ReorderQuantity;
    private int MinStock;
    private int MaxStock;
    private Date Exp_Date;
    private int Quantitypresent;
    private double purchasePrice;
    private double sellingPrice;
    private int Quantityneeded;
    private String reorderStatus = "N";

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getReorderQuantity() {
        return ReorderQuantity;
    }

    public void setReorderQuantity(int ReorderQuantity) {
        this.ReorderQuantity = ReorderQuantity;
    }

    public int getMinStock() {
        return MinStock;
    }

    public void setMinStock(int MinStock) {
        this.MinStock = MinStock;
    }

    public int getMaxStock() {
        return MaxStock;
    }

    public void setMaxStock(int MaxStock) {
        this.MaxStock = MaxStock;
    }

    public Date getExp_Date() {
        return Exp_Date;
    }

    public void setExp_Date(Date Exp_Date) {
        this.Exp_Date = Exp_Date;
    }

    public int getQuantitypresent() {
        return Quantitypresent;
    }

    public void setQuantitypresent(int Quantitypresent) {
        this.Quantitypresent = Quantitypresent;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantityneeded() {
        return Quantityneeded;
    }

    public void setQuantityneeded(int Quantityneeded) {
        this.Quantityneeded = Quantityneeded;
    }

    public String getReorderStatus() {
        return reorderStatus;
    }

    public void setReorderStatus(String reorderStatus) {
        this.reorderStatus = reorderStatus;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString() {
        return this.drugName;
    }
}
