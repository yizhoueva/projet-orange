/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyaufonctionnel;

import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

/**
 *
 * @author nicolascapon
 */
public class NameHandler implements Serializable{
    public String name;
    
    public NameHandler() {
    name = "source";
}

    /**
     * @return the name
     */
    public String getName() throws MalformedURLException {
        URL url = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser test = new Parser(url);
        String a = test.getValueString(this.name);
        return a;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
