/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Code.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pragneshanekal
 */
public class HospitalEnterPrise extends EnterPrise {

    public HospitalEnterPrise(String Name) {

        super(Name, EnterPrise.EntType.Hospital);

    }
//@Override get SupportRole()

    public ArrayList<Role> getRole() {
        return null;

    }

}
