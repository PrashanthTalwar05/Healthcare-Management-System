/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code.WorkQueue;

import Code.Account;
import java.util.Date;

/**
 *
 * @author raksh
 */
public class WorkRequest {

    private String text;
    private Account sender;
    private Account receiving;
    private String status;
    private String requestingDate;
    private Date resolvingDate;

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiving;
    }

    public void setReceiver(Account receiver) {
        this.receiving = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestingDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestingDate = requestDate;
    }

    public Date getResolveDate() {
        return resolvingDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolvingDate = resolveDate;
    }

    @Override
    public String toString() {
        return sender.getUsrnm();
    }

}
