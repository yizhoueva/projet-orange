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

    BloodGlucose bg;
    BloodOxygen bo;
    BodyMassIndex bmi;
    Weight w;
    Height h;
    BodyFat bf;

    private int glycemie;
    private int sat;
    private int tensionS;
    private int tensionD;
    private int imc;
    private int poids;
    private int taille;
    private int graisse;

    public Physiologie() throws MalformedURLException, IOException {

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
        
        
        // Configuration de Gson
        gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(Height.class, new HeightDeserialiseur());
        gson = gsonBuilder.create();

        setInput(connexion("https://api.humanapi.co/v1/human/body_fat?access_token=demo"));
        setResults(lecture(input));
        System.out.println("BodyFat? " + results);
        //création de l'objet BloodGlucose
        BodyFat bf = gson.fromJson(results, BodyFat.class);
        this.bf = bf;
        
        
        
        

        //récupérer la dernière valeur de la glycémie
        URL url = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser p = new Parser(url);

        this.glycemie = p.getValueInt("value");

        //récupérer la dernière valeure de la saturation en oxygene
        URL url2 = new URL("https://api.humanapi.co/v1/human/blood_oxygen?access_token=demo");
        Parser p2 = new Parser(url2);

        this.sat = p2.getValueInt("value");

        //récupérer la dernière valeure de la tensions systolique
        URL url3 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p3 = new Parser(url3);

        this.tensionS = p3.getValueInt("systolic");

        //récupérer la dernière valeure de la tension diastolique
        URL url4 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p4 = new Parser(url4);

        this.tensionD = p4.getValueInt("diastolic");

        //récupérer la dernière valeure de l'imc
        URL url5 = new URL("https://api.humanapi.co/v1/human/bmi?access_token=demo");
        Parser p5 = new Parser(url5);

        this.imc = p5.getValueInt("value");

        //récupérer la dernière valeure du poids
        URL url6 = new URL("https://api.humanapi.co/v1/human/weight?access_token=demo");
        Parser p6 = new Parser(url6);

        this.poids = p6.getValueInt("value");

        //récupérer la dernière valeure de la taille
        URL url7 = new URL("https://api.humanapi.co/v1/human/height?access_token=demo");
        Parser p7 = new Parser(url7);

        this.taille = p7.getValueInt("value");

        //récupérer la dernière valeure de la masse graisseuse
        URL url8 = new URL("https://api.humanapi.co/v1/human/body_fat?access_token=demo");
        Parser p8 = new Parser(url8);

        this.graisse = p8.getValueInt("value");

    }

    public int getGlycemie() {
        return glycemie;
    }

    /**
     * @return the sat
     */
    public int getSat() {
        return sat;
    }

    /**
     * @return the imc
     */
    public int getImc() {
        return imc;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @return the tensionS
     */
    public int getTensionS() {
        return tensionS;
    }

    /**
     * @return the tensionD
     */
    public int getTensionD() {
        return tensionD;
    }

    /**
     * @return the taille
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @return the graisse
     */
    public int getGraisse() {
        return graisse;
    }

}
