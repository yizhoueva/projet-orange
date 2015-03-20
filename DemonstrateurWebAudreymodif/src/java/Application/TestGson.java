/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

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
        bp1.deserialiser(bp1);
        System.out.println("id"+bp1.getId());
        System.out.println("userId"+bp1.getUserId());
        System.out.println("humanId"+bp1.getHumanId());
        System.out.println("timestamp"+bp1.getTimestamp());
        System.out.println("source"+bp1.getSource());
        System.out.println("systolic"+bp1.getSystolic());
        System.out.println("diastolic"+bp1.getDiastolic());
        System.out.println("unit"+bp1.getUnit());
        System.out.println("heartRate"+bp1.getHeartRate());
        System.out.println("createdAt"+bp1.getCreatedAt());
        System.out.println("updatedAt"+bp1.getUpdatedAt());
            

}

}
