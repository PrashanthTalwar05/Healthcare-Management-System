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
public class Directory_Employee {

    private ArrayList<Employee> E_List;

    public Directory_Employee() {

        E_List = new ArrayList<>();
    }

    public Employee AddEmployee(String name) {
        Employee emp = new Employee();
        emp.setEName(name);
        E_List.add(emp);
        return emp;
    }

    public ArrayList<Employee> getE_List() {
        return E_List;
    }

    public void setE_List(ArrayList<Employee> E_List) {
        this.E_List = E_List;
    }

}
