/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author pragneshanekal
 */
public class Employee {

    private String EName;
    private static int counter = 1;
    private int EId;

    public Employee() {

        EId = counter;
        counter++;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }
//to display in table

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    @Override
    public String toString() {

        return EName;
    }

}
