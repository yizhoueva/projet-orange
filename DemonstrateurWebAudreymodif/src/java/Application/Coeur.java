/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import agregateur.BloodGlucose;
import agregateur.BloodPressure;
import agregateur.HeartRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.BloodGlucoseDeserialiseur;
import deserialiseur.BloodPressureDeserialiseur;
import deserialiseur.HeartRateDeserialiseur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.ParseException;

/**
 *
 * @author Romeo
 */
public class Coeur extends ApplicationObjet implements Serializable {

    HeartRate[] hrs;
    BloodPressure[] bps;
    String hrPlot;
    String bpPlot;

   

    /**
     *
     * @return
     */
    public String getHrPlot() throws ParseException {
        String s = "[[";
        for (int i = 0; i < hrs.length; i++) {
            HeartRate hr = hrs[i];
            s += "[" + hr.convertDateToPlottable(hr.getTimestamp())+ ", " + hrs[i].getValue() + "]";
            if (i != hrs.length - 1) {
                s += ",";
            }

        }
        s += "]]";
        System.out.println(s);

        return s;

    }

    public String getBpPlot() {
        String s = "[[";
        for (int i = 0; i < bps.length; i++) {
            BloodPressure bp = bps[i];
            int pressionMoyenne = (bp.getSystolic() + 2*bp.getDiastolic())/3;
            s += "[" + i + ", " +pressionMoyenne + "]";
            if (i != hrs.length - 1) {
                s += ",";
            }

        }
        s += "]]";
        System.out.println(s);

        return s;

    }

    public HeartRate[] getHrs() {
        return hrs;
    }

    public BloodPressure[] getBps() {
        return bps;
    }


    /**
     *
     * @throws MalformedURLException
     * @throws IOException
     */
    public Coeur() throws MalformedURLException, IOException {

        // Configuration de Gson
        gsonBuilder = new GsonBuilder();
        gsonBuilder
                .registerTypeAdapter(BloodPressure.class, new BloodPressureDeserialiseur());
        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/blood_pressure/readings?access_token=demo");
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
        BloodPressure[] bps = gson.fromJson(results, BloodPressure[].class);

        this.bps = bps;

        // Configuration de Gson
        gsonBuilder.registerTypeAdapter(HeartRate.class, new HeartRateDeserialiseur());
        gson = gsonBuilder.create();

        //Connexion à l'agregateur
        url = new URL("https://api.humanapi.co/v1/human/heart_rate/readings?access_token=demo");
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
        HeartRate[] hrs = gson.fromJson(results, HeartRate[].class);

        this.hrs = hrs;

    }

}