package Application;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicolascapon
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        
        URL url = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser test = new Parser(url);
        String a = test.getValueString("source");
        System.out.println(a);
        int b = test.getValueInt("value");
        System.out.println(b);
     
        URL url3 = new URL("https://api.humanapi.co/v1/human/sleeps/summaries?access_token=demo");
        
        int i =0;
        Parser p3 = new Parser(url3);
        System.out.println(p3.getTexte());
        
        JSONArray j = new JSONArray(p3.getTexte());
        //JSONArray test1 = j.getJSONArray(i);
        //ArrayList list = getJSONArray(i);
        //JSONObject t = j.getJSONObject(i);
        for (int k = 0;k<j.length();k++){
            System.out.println("time Asleep = " + j.getJSONObject(k).optString("timeAsleep"));
        }
        //System.out.println("time Asleep = " + j.getJSONObject(i).optString("timeAsleep"));
        //System.out.println("time Asleep = " + j.getJSONObject(i).getString("timeAwake"));
        
        
//        URL url1 = new URL("https://api.humanapi.co/v1/human/activities/summaries?access_token=demo");
//        Parser p1 = new Parser(url1);
//        
//        int duration=p1.getValueInt("duration");
//        System.out.println(duration);
        
    }

}
