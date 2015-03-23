/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import agregateur.BloodGlucose;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.BloodGlucoseDeserialiseur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Calendar;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Romeo
 */
public class ApplicationObjet {
    GsonBuilder gsonBuilder;
    Gson gson;
    URL url;
    URLConnection con;
    InputStream input;
    BufferedReader reader;
    String line, results = "";
    
    public InputStream connexion(String requete) throws MalformedURLException, IOException{
        //Connexion à l'agregateur
        this.url = new URL(requete);
        this.con = url.openConnection();
        return con.getInputStream();
    }
    
    public String lecture(InputStream input)throws IOException {
        
        //lecture de la réponse
        reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        line=""; results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        };
        reader.close();
        input.close();
        return results;
    }
    
    public String convertirDate(String date){
        Calendar c = javax.xml.bind.DatatypeConverter.parseDateTime(date);
        return c.getTime().toString();
    }

    public void setInput(InputStream input) {
        this.input = input;
    }

    public void setResults(String results) {
        this.results = results;
    }
 
    
}
