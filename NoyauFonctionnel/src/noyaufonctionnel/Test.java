package noyaufonctionnel;


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

        URL url = new URL("https://api.humanapi.co/v1/human?access_token=demo");
        Parser test = new Parser(url);
        String a = test.getValue("gender");
        System.out.println(a);

    }

}
