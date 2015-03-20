/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregateur;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.BloodPressureDeserialiseur;
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
public class BloodPressure {

    private String id;
    private String userId;
    private String humanId;
    private String timestamp;
    private String source;
    private String systolic;
    private String diastolic;
    private String unit;
    private String heartRate;
    private String createdAt;
    private String updatedAt;

    //Deserialiseur
    public BloodPressure deserialiser() throws MalformedURLException, IOException {
        
        System.out.println("intialisation de la deserialisation de BloodPressure");

        // Configure Gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BloodPressure.class, new BloodPressureDeserialiseur());
        Gson gson = gsonBuilder.create();

        URL url = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");

        URLConnection con = url.openConnection();
        InputStream input = con.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
        String line, results = "";
        while ((line = reader.readLine()) != null) {
            results += line;
        }
        System.out.println("Chaine de caractère récupérée : "+results);
        
        reader.close();
        input.close();
        
        BloodPressure bp = gson.fromJson(results, BloodPressure.class);
        System.out.println("created at : "+bp.getCreatedAt());
        return bp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
