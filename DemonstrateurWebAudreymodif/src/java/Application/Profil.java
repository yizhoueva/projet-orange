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
import agregateur.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
<<<<<<< HEAD

public class Profil implements Serializable {
    
    private String userId;
    private String createdAt;
    private String email;
    private String humanId;
    private String timezone;
=======
import java.nio.charset.Charset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Profil extends ApplicationObjet implements Serializable {

    private Profile p;
    private BloodPressure bp;
    private BloodGlucose bg;
    private BloodOxygen bo;
    private BodyMassIndex bmi;
    private Weight w;
    private Height h;
    private String test = "zorro";
    
>>>>>>> 3ead0d5f0fd29194fba22504ec75e72c721a9e0b

    //Constructeur
    public Profil() throws MalformedURLException, IOException {

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Profile.class, new ProfileDeserialiseur());
        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/profile?access_token=demo");
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
        Profile p = gson.fromJson(results, Profile.class);
        this.p = p;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodPressure.class, new BloodPressureDeserialiseur());
        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
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
        BloodPressure bp = gson.fromJson(results, BloodPressure.class);
        this.bp = bp;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodGlucose.class, new BloodGlucoseDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Glucose? " + results);
        //création de l'objet BloodGlucose
        BloodGlucose bg = gson.fromJson(results, BloodGlucose.class);
        this.bg = bg;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodOxygen.class, new BloodOxygenDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/blood_oxygen?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Blood Oxygen : " + results);

        //création de l'objet BloodOxygen
        BloodOxygen bo = gson.fromJson(results, BloodOxygen.class);
        this.bo = bo;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BodyMassIndex.class, new BodyMassIndexDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/bmi?access_token=demo"));
        setResults(lecture(input));
        System.out.println("BodyMassIndex? " + results);
        //création de l'objet BloodGlucose
        BodyMassIndex bmi = gson.fromJson(results, BodyMassIndex.class);
        this.bmi = bmi;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Weight.class, new WeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/weight?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Weight? " + results);
        //création de l'objet BloodGlucose
        Weight w = gson.fromJson(results, Weight.class);
        this.w = w;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Height.class, new HeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/height?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Height? " + results);
        //création de l'objet BloodGlucose
        Height h = gson.fromJson(results, Height.class);
        this.h = h;

    }

    public Profile getP() {
        return p;
    }

    public BloodPressure getBp() {
        return bp;
    }

    public BloodGlucose getBg() {
        return bg;
    }

    public BloodOxygen getBo() {
        return bo;
    }

    public BodyMassIndex getBmi() {
        return bmi;
    }

    @Bean (name="Poids")
    public Weight getW() {
        return w;
    }

    public Height getH() {
        return h;
    }

    
    
    public String getTest() {
        return "toto";
    }


}
