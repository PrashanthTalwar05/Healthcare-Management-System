/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.Design;

import Code.Account;
import Code.EcoSystem;
import Code.Employee;
import Code.Role.Role_SystemAdmin;
//mport Code.UsrAcc.UsrAccnt;

/**
 *
 * @author MIlindh R Kashyap
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem eco = EcoSystem.getReferrence();
        Employee emp = eco.getEmpDir().AddEmployee("NEU");
        // UsrAccnt ua = eco.getUserAccDir().createUserAccount("sps","sps", emp, new Role_SystemAdmin());
        Account ac = eco.getUserAccDir().createUserAccount("sps", "sps", emp, new Role_SystemAdmin());

        return eco;

    }

}
