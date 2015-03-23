/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nicolascapon
 */
public class Dates implements Serializable {

    private String date;

    public Dates() {
        Calendar c = Calendar.getInstance(); // date du jour 
        Date d = c.getTime();
        this.date = d.toString();
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        if(date.equals("now")){
            Calendar c = Calendar.getInstance(); // date du jour 
        Date d = c.getTime();
        date = d.toString();
        }
        this.date = date;
    }
}
