/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import noyaufonctionnel.Profil;

/**
 *
 * @author Romeo
 */
public class ProfilDeserialiseur implements JsonDeserializer<Profil> {

    @Override
    public Profil deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();
        
        final String userId = jsonObject.get("userId").getAsString();
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String email = jsonObject.get("email").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        
        final JsonObject defaultTimeZone = jsonObject.get("defaultTimeZone").getAsJsonObject();
        final String namezone = defaultTimeZone.get("name").getAsString();
        System.out.println("namezone : "+namezone);

        Profil profil = new Profil();
        profil.setUserId(userId);
        profil.setCreatedAt(createdAt);
        profil.setHumanId(humanId);
        profil.setEmail(email);
        profil.setTimezone(namezone);
        
        return profil;
    }

}
