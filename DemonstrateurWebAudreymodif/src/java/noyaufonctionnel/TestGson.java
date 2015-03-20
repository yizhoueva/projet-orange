/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyaufonctionnel;

import agregateur.BloodPressure;
import java.io.IOException;

/**
 *
 * @author Romeo
 */
public class TestGson {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
     
        
            BloodPressure bp1 = new BloodPressure();
            bp1.deserialiser();
            System.out.println("ok la caille");
        
    }
    
}
