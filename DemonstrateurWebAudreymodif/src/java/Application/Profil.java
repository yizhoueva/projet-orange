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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.ProfilDeserialiseur;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;

public class Profil implements Serializable {

    private String userId;
    private String createdAt;
    private String email;
    private String humanId;
    private String timezone;

    //Constructeur
    public Profil(){

//        // Configure Gson
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(Profil.class, new ProfilDeserialiseur());
//        Gson gson = gsonBuilder.create();
//
//        // The JSON data
//        String input = new URL("https://api.humanapi.co/v1/human/Profil?access_token=demo").openStream().toString();
//        
//            // Parse JSON to Java
//            Profil profil = gson.fromJson(input, Profil.class);
//            System.out.println(profil);
        
 //       String input = new URL("https://api.humanapi.co/v1/human/Profil?access_token=demo").openStream().toString();
        

        }
     public void deserialiser() throws MalformedURLException, IOException {

        // Configure Gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Profil.class, new ProfilDeserialiseur());
        Gson gson = gsonBuilder.create();

        // The JSON data
        //String input = new URL("https://api.humanapi.co/v1/human/Profil?access_token=demo").openStream().toString();
        URL url = new URL("https://api.humanapi.co/v1/human/Profile?access_token=demo");

        URLConnection con = url.openConnection();
        InputStream input = con.getInputStream();

        String texte = "";

        while (input.available() > 0) {
            char b = (char) input.read();
            texte += Character.toString(b);
        }
        System.out.println("resultat json : " + texte);

        // Parse JSON to Java
        Profil profil = gson.fromJson(texte, Profil.class);
        this.createdAt = profil.createdAt;
        this.email = profil.email;
        this.humanId = profil.humanId;
        this.userId = profil.userId;
        this.timezone = profil.timezone;

//        String input = new URL("https://api.humanapi.co/v1/human/Profil?access_token=demo").openStream().toString();
    }

    

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    

    public String getUserId() {
        return userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public String getHumanId() {
        return humanId;
    }

    public String getTimezone() {
        return timezone;
    }

}
