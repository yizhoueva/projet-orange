/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Romeo
 */
import agregateur.Genetics;
import com.google.gson.GsonBuilder;
import deserialiseur.GeneticsDeserialiseur;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

public class Genetique extends ApplicationObjet implements Serializable {

    private Genetics[] g;

    public Genetique() throws MalformedURLException, IOException {

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Genetics.class, new GeneticsDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/genetic/traits?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Genetics? " + results);
        
        //création de l'objet Genetics
        
        Genetics[] g = gson.fromJson(results, Genetics[].class);
            
        this.g = g;
    }

    public Genetics[] getG() {
        return g;
    }

}
