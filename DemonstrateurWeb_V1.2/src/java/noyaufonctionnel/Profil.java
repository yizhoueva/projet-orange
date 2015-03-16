/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyaufonctionnel;

/**
 *
 * @author Romeo
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deserialiseur.ProfilDeserialiseur;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

public class Profil implements Serializable {

    private String userId;
    private String createdAt;
    private String email;
    private String humanId;

    //Constructeur
    public Profil() throws MalformedURLException, IOException {

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
        
        String input = new URL("https://api.humanapi.co/v1/human/Profil?access_token=demo").openStream().toString();
        

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

}
