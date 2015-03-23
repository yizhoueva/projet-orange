/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import agregateur.BloodPressure;
import agregateur.Sleep;
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

        System.out.println("ca demarre");
//        
//        Coeur2 c = new Coeur2();
//        System.out.println(c.hr.getTimestamp());
//        
//        Physiologie ph1 = new Physiologie();
//        System.out.println("derniere valeur de glucose : "+ph1.bg.getValue());
//        
        
        
//        Genetique g1 = new Genetique();
//        
//        System.out.println("genetics numero 0 :");
//        System.out.println("userId : "+g1.getG()[0].getUserId());
//        System.out.println("humanId : "+g1.getG()[0].getHumanId());
//        System.out.println("trait : "+g1.getG()[0].getTrait());
//        System.out.println("description : "+g1.getG()[0].getDescription());
//        System.out.println("possible traits : ");
//        for (int i = 0; i < g1.getG()[0].getPossibleTraits().length; i++) {
//            System.out.println("  >>"+g1.getG()[0].getPossibleTraits()[i]);
//            
//        }
        
        Sommeil s1 = new Sommeil();
        Sleep[] sleeps1 = s1.getSleeps();
        for (int i = 0; i < sleeps1.length; i++) {
            Sleep sleep = sleeps1[i];
            System.out.println("Sommeil numero "+(i+1)+" :");
            System.out.println("  >userId : "+sleep.getUserId());
            System.out.println("  >humanId : "+sleep.getHumanId());
            System.out.println("  >date : "+sleep.getDate());
            System.out.println("  >source : "+sleep.getSource());
            System.out.println("  >timeAsleep : "+sleep.getTimeAsleep());
            System.out.println("  >timeAwake : "+sleep.getTimeAwake());
            System.out.println("  >createdAt : "+sleep.getCreatedAt());
            System.out.println("  >id : "+sleep.getId());
            System.out.println("  >updatedAt : "+sleep.getUpdatedAt());
            
        }
            
        }
        
}
