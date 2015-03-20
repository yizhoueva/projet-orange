/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregateur;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.BloodPressureDeserialiseur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 *
 * @author Romeo
 */
public class AgregateurObjet {
    
    
    private String requete = null;
    GsonBuilder gsonBuilder = new GsonBuilder();
    
     //Deserialiseur
    public void deserialiser() throws MalformedURLException, IOException {
        
        System.out.println("intialisation de la deserialisation de : "+this.getClass());

        // Configure Gson
        
        URL url = new URL(requete);

        URLConnection con = url.openConnection();
        InputStream input = con.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        String line, results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        }
        System.out.println("Chaine de caractère récupérée pour "+this.getClass()+" : "+results);
        
        reader.close();
        input.close();
        
        
        
        
    }
    
    public void update(Gson gson){
        
    }

    public void setRequete(String requete) {
        this.requete = requete;
    }
    
}
