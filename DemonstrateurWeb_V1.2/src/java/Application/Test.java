package Application;


import java.io.IOException;
import java.net.URL;

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
        
<<<<<<< Updated upstream
//        URL url1 = new URL("https://api.humanapi.co/v1/human/activities/summaries?access_token=demo");
//        Parser p1 = new Parser(url1);
//        
//        int duration=p1.getValueInt("duration");
//        System.out.println(duration);
        
=======
        URL url1 = new URL("https://api.humanapi.co/v1/human/activities/summaries?access_token=demo");
        Parser test1 = new Parser(url1);
        String t = test1.getValueString("source");
        System.out.println(t);
>>>>>>> Stashed changes
    }

}
