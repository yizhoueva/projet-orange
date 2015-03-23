/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.Profile;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romeo
 */
public class ProfileDeserialiseur implements JsonDeserializer<Profile> {

    @Override
    public Profile deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();
        
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String email = jsonObject.get("email").getAsString();
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final JsonObject defaultTimeZone = jsonObject.get("defaultTimeZone").getAsJsonObject();
        final String namezone = defaultTimeZone.get("name").getAsString();
        System.out.println("namezone : "+namezone);

        Profile p = new Profile();
        p.setUserId(userId);
        p.setCreatedAt(createdAt);
        p.setHumanId(humanId);
        p.setEmail(email);
        p.setDefaultTimeZone(namezone);
        
        return p;
    }

}
