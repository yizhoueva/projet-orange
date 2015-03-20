/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyaufonctionnel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.CoeurDeserialiseur;
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
public class Coeur2 {

    private int freqcardio;
    private int systolic;
    private int diastolic;
    private String unitHR;
    private String unitTen;

    private int[] heartRates;
    private String stringHeartRates;
    
    private int tension;
    private int[] tensions;
    private String stringTensions;

    public void deserialiser() throws MalformedURLException, IOException {

        // Configure Gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Coeur2.class, new CoeurDeserialiseur());
        Gson gson = gsonBuilder.create();

        URL url = new URL("https://api.humanapi.co/v1/human/heart_rate/readings?access_token=demo");

        URLConnection con = url.openConnection();
        InputStream input = con.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        String line, results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        }
        reader.close();
        input.close();
        
        
        
        System.out.println("results : " + results);
        System.out.println("longueur de results : " + results.length());

        Coeur2 coeur = gson.fromJson(results, Coeur2.class);
        //this.diastolic=coeur.diastolic;
        this.freqcardio = coeur.getFreqcardio();
        //this.systolic=coeur.freqcardio;
        //this.unitHR=coeur.unitHR;
        //this.unitTen=coeur.unitTen;
        this.heartRates = coeur.heartRates;
        this.stringHeartRates=getStringHeartRates();
        
        this.tension = coeur.tension;
        this.tensions = coeur.getTensions();
        this.stringTensions = getStringTensions();
        
        url = new URL("https://api.humanapi.co/v1/human/blood_pressure/readings?access_token=demo");

        con = url.openConnection();
        input = con.getInputStream();

        reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        line=""; results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        }
        reader.close();
        input.close();
        
        coeur = gson.fromJson(results, Coeur2.class);
        
        
        
    }

    public int getFreqcardio() {
        return freqcardio;
    }

    public void setFreqcardio(int freqcardio) {
        this.freqcardio = freqcardio;
    }
    
    

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public String getUnitHR() {
        return unitHR;
    }

    public void setUnitHR(String unitHR) {
        this.unitHR = unitHR;
    }

    public String getUnitTen() {
        return unitTen;
    }

    public void setUnitTen(String unitTen) {
        this.unitTen = unitTen;
    }

    public int[] getHeartRates() {
        return heartRates;
    }

    public void setHeartRates(int[] heartRates) {
        this.heartRates = heartRates;
    }

    public String getStringHeartRates() {
        String s = "[[";
        for (int i = 0; i < heartRates.length; i++) {
            s +="["+ i + ", " + heartRates[i]+"]";
            if(i != heartRates.length-1){
                s += ",";
            }

        }
        s += "]]";
        
        return s;
    }

    public void setStringHeartRates(String stringHeartRates) {
        this.stringHeartRates = stringHeartRates;
    }

    public int getTension() {
        return tension;
    }

    public void setTension(int tension) {
        this.tension = tension;
    }

    public int[] getTensions() {
        return tensions;
    }

    public void setTensions(int[] tensions) {
        this.tensions = tensions;
    }

    public String getStringTensions() {
        return stringTensions;
    }

    public void setStringTensions(String stringTensions) {
        this.stringTensions = stringTensions;
    }

}
