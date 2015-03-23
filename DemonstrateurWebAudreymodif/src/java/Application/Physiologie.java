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
import deserialiseur.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;

public class Physiologie extends ApplicationObjet implements Serializable {

    BloodGlucose[] bg;
    BloodOxygen[] bo;
    BodyMassIndex[] bmi;
    Weight[] w;
    Height[] h;
    BodyFat[] bf;

    public Physiologie() throws MalformedURLException, IOException {

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodGlucose.class, new BloodGlucoseDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Glucose? " + results);
        //création de l'objet BloodGlucose
        BloodGlucose[] bg = gson.fromJson(results, BloodGlucose[].class);
        this.bg = bg;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodOxygen.class, new BloodOxygenDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/blood_oxygen?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Blood Oxygen : " + results);

        //création de l'objet BloodOxygen
        BloodOxygen[] bo = gson.fromJson(results, BloodOxygen[].class);
        this.bo = bo;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BodyMassIndex.class, new BodyMassIndexDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/bmi?access_token=demo"));
        setResults(lecture(input));
        System.out.println("BodyMassIndex? " + results);
        //création de l'objet BloodGlucose
        BodyMassIndex[] bmi = gson.fromJson(results, BodyMassIndex[].class);
        this.bmi = bmi;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Weight.class, new WeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/weight?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Weight? " + results);
        //création de l'objet BloodGlucose
        Weight[] w = gson.fromJson(results, Weight[].class);
        this.w = w;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Height.class, new HeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/height?access_token=demo"));
        setResults(lecture(input));
        System.out.println("Height? " + results);
        //création de l'objet BloodGlucose
        Height[] h = gson.fromJson(results, Height[].class);
        this.h = h;

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Height.class, new HeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/body_fat?access_token=demo"));
        setResults(lecture(input));
        System.out.println("BodyFat? " + results);
        //création de l'objet BloodGlucose
        BodyFat[] bf = gson.fromJson(results, BodyFat[].class);
        this.bf = bf;

    }
}
