/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregateur;

/**
 *
 * @author Romeo
 */
public class Sleep extends AgregateurObjet {
    
    String date;
    String timeAsleep;
    String timeAwake;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeAsleep() {
        return timeAsleep;
    }

    public void setTimeAsleep(String timeAsleep) {
        this.timeAsleep = timeAsleep;
    }

    public String getTimeAwake() {
        return timeAwake;
    }

    public void setTimeAwake(String timeAwake) {
        this.timeAwake = timeAwake;
    }
    
}
