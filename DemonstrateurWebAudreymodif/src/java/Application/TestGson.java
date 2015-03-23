/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import agregateur.Activity;
import agregateur.BloodPressure;
import agregateur.HeartRate;
import agregateur.Sleep;
import java.io.IOException;
<<<<<<< HEAD
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
=======
>>>>>>> 93967c1be9c1d14693b4d1cfbcc2041980e14a51

/**
 *
 * @author Romeo
 */
public class TestGson {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, ParseException {

        System.out.println("ca demarre");
<<<<<<< HEAD
//
        Coeur c = new Coeur();
        HeartRate[] hrs = c.getHrs();
        for (int i = 0; i < hrs.length; i++) {
            HeartRate hr = hrs[i];
//            System.out.println("Valeur n° " + (i + 1) + " :");
//            System.out.println("  >userId : " + hr.getUserId());
//            System.out.println("  >humanId : " + hr.getHumanId());
            DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            String string1 = hr.getTimestamp();
            Date result1 = df1.parse(string1);
//          Calendar rightNow = Calendar.getInstance();


            String lala = new SimpleDateFormat( "yyyy-MM-dd", Locale.FRANCE).format(result1);
    
                    //2008-09-30 4:00PM
            System.out.println(lala);
            //System.out.println("  >timestamp : " + hr.getTimestamp().parse(string1);
=======

//        Coeur c = new Coeur();
//        String u =c.getBpPlot();
//        HeartRate[] hrs = c.getHrs();
//        for (int i = 0; i < hrs.length; i++) {
//            HeartRate hr = hrs[i];
//            System.out.println("Valeur n° " + (i + 1) + " :");
//            System.out.println("  >userId : " + hr.getUserId());
//            System.out.println("  >humanId : " + hr.getHumanId());
//            System.out.println("  >timestamp : " + hr.getTimestamp());
>>>>>>> 93967c1be9c1d14693b4d1cfbcc2041980e14a51
//            System.out.println("  >source : " + hr.getSource());
//            System.out.println("  >value : " + hr.getValue());
//            System.out.println("  >unit : " + hr.getUnit());
//            System.out.println("  >createdAt : " + hr.getCreatedAt());
//            System.out.println("  >id : " + hr.getId());
//            System.out.println("  >updatedAt : " + hr.getUpdatedAt());
//
        }

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
//        
//        Sommeil s1 = new Sommeil();
//        Sleep[] sleeps1 = s1.getSleeps();
//        for (int i = 0; i < sleeps1.length; i++) {
//            Sleep sleep = sleeps1[i];
//            System.out.println("Sommeil numero "+(i+1)+" :");
//            System.out.println("  >userId : "+sleep.getUserId());
//            System.out.println("  >humanId : "+sleep.getHumanId());
//            System.out.println("  >date : "+sleep.getDate());
//            System.out.println("  >source : "+sleep.getSource());
//            System.out.println("  >timeAsleep : "+sleep.getTimeAsleep());
//            System.out.println("  >timeAwake : "+sleep.getTimeAwake());
//            System.out.println("  >createdAt : "+sleep.getCreatedAt());
//            System.out.println("  >id : "+sleep.getId());
//            System.out.println("  >updatedAt : "+sleep.getUpdatedAt());
//            
//        }
//        
//        Profil p = new Profil();
//        System.out.println("email : "+p.getP().getEmail());
//        System.out.println("tension : "+p.getBp().getSystolic()+"/"+p.getBp().getDiastolic()+" "+p.getBp().getUnit());
//        System.out.println("glucose : "+p.getBg().getValue()+" "+p.getBg().getUnit());
//        System.out.println("oxygene : "+p.getBo().getValue());
//        System.out.println("IMC : "+p.getBmi().getValue());
//        System.out.println("poids : "+p.getW().getValue());
//        System.out.println("taille : "+p.getH().getValue()+" "+p.getH().getUnit());
//        
//        
//        
//        
<<<<<<< HEAD
        Activités acs = new Activités();
        Activity[] as = acs.getActivites();
        for (int i = 0; i < as.length; i++) {
            Activity a = as[i];
//            System.out.println("Valeur n° " + (i + 1) + " :");
//            System.out.println("  >calories : " + a.getCalories());

        }
=======
//        
//        
//        Activités acs=new Activités();
//        Activity[] as = acs.getActivites();
//        for (int i = 0; i < as.length; i++) {
//            Activity a = as[i];
//            System.out.println("Valeur n° " + (i + 1) + " :");
//            System.out.println("  >calories : " + a.getCalories());
//
//        }
>>>>>>> 93967c1be9c1d14693b4d1cfbcc2041980e14a51
    }

}
