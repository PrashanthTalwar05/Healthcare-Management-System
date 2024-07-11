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
public class AccountDirectory {

    private ArrayList<Account> accountList;

    public AccountDirectory() {
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public Account validateAccount(String usrnm, String pwd) {
        for (Account acc : accountList) {
            System.out.println("Name: " + acc.getUsrnm() + " Password: " + acc.getPwd());

            if (usrnm.equals(acc.getUsrnm()) && pwd.equals(acc.getPwd())) {
                return acc;
            }
        }
        return null;
    }

    public Account createUserAccount(String usrnm, String pwd, Employee emp, Role role) {
        Account acc = new Account();
        acc.setUsrnm(usrnm);
        acc.setPwd(pwd);
        acc.setEmp(emp);
        acc.setRole(role);
        accountList.add(acc);
        return acc;
    }

    public boolean uniqueAccountCheck(String usrnm) {
        for (Account acc : accountList) {
            if (acc.getUsrnm().equals(usrnm)) {
                return false;
            }
        }
        return true;
    }
}
