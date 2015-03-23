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
import java.util.ArrayList;
import org.json.JSONArray;

public class Activites extends ApplicationObjet implements Serializable {

    private Activity[] activites;
    private ArrayList<String> act;

    public Activites() throws MalformedURLException, IOException {

        // Configuration de Gson
//        gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(Activity.class, new ActivityDeserialiseur());
//        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/activities?access_token=demo");
//        con = url.openConnection();
//        input = con.getInputStream();
//
//        //lecture de la réponse
//        reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
//        line = "";
//        results = "";
//        while ((line = reader.readLine()) != null) {
//            results += line;
//        }
//
//        reader.close();
//
//        input.close();
//
//        //création de l'objet BloodPressure
//        Activity[] activites = gson.fromJson(results, Activity[].class);
//
//        this.activites = activites;
//        
//     
        Parser p3 = new Parser(url);
        JSONArray j = new JSONArray(p3.getTexte());
        this.act=new ArrayList<String>();
        for (int k = 0;k<j.length();k++){
            act.add("startTime = " + j.getJSONObject(k).optString("startTime") + " " +j.getJSONObject(k).optString("type"));
        }

    }

    public Activity[] getActivites() {
        return activites;
    }

    /**
     * @return the act
     */
    public ArrayList<String> getAct() {
        return act;
    }
    
    public String getValuesFromIndex(int i) throws IOException{
        ArrayList<String> vAct=new ArrayList<String>();
        Parser p = new Parser(url);
        JSONArray j = new JSONArray(p.getTexte());
        for (int k = 0;k<j.length();k++){ 
            vAct.add(j.getJSONObject(k).toString());
        }
        return vAct.get(i);
    }
}

