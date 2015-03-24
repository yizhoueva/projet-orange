/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import agregateur.Sleep;
import com.google.gson.GsonBuilder;
import deserialiseur.SleepDeserialiseur;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;

/**
 *
 * @author Romeo
 */
public class Sommeil extends ApplicationObjet implements Serializable {
    
    Sleep[] sleeps;

    public Sommeil() throws MalformedURLException, IOException {
        
        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Sleep.class, new SleepDeserialiseur());
        gson = gsonBuilder.create();
        
        setInput(connexion("https://api.humanapi.co/v1/human/sleeps/summaries?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Sommeil? " + results);
        //création de l'objet BloodGlucose
        Sleep[] s = gson.fromJson(results, Sleep[].class);
        this.sleeps = s;
    }

    public Sleep[] getSleeps() {
        return sleeps;
    }
    
    public Sleep getLast(){
        return sleeps[sleeps.length-1];
    }
    
    
    
    
}
