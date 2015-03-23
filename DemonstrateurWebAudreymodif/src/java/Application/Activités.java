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
import agregateur.Activity;
import com.google.gson.GsonBuilder;
import deserialiseur.ActivityDeserialiseur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.charset.Charset;

public class Activités extends ApplicationObjet implements Serializable {

    private Activity[] activites;

    public Activités() throws MalformedURLException, IOException {

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Activity.class, new ActivityDeserialiseur());
        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/activities?access_token=demo");
        con = url.openConnection();
        input = con.getInputStream();

        //lecture de la réponse
        reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        line = "";
        results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        }

        reader.close();

        input.close();

        //création de l'objet BloodPressure
        Activity[] activites = gson.fromJson(results, Activity[].class);

        this.activites = activites;

    }

    public Activity[] getActivites() {
        return activites;
    }

}
