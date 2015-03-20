/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Romeo
 */

import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

public class Activités implements Serializable {
    
    
    private int duration;
    private int distance;
    private int steps;
    private int calories;
    private String source="source";

    
    
    public Activités()throws MalformedURLException {
        URL url = new URL("https://api.humanapi.co/v1/human/activities/summaries?access_token=demo");
        Parser p = new Parser(url);
//        
//        this.duration=p.getValueInt("duration");
//        this.calories=p.getValueInt("calories");
        
    }       
    /**
     * @return the duration
     * @throws java.net.MalformedURLException
     */
    public int getDuration()  {
       return duration;
    }
   

   
    
  

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance ;
    }

    /**
     * @return the steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }

    /**
     * @return the calories
     */
    public int getCalories() {
        
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    
}
