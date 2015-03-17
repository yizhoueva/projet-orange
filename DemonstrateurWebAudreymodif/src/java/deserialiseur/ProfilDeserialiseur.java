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

        Profil profil = null;
        try {
            profil = new Profil();
        } catch (IOException ex) {
            Logger.getLogger(ProfilDeserialiseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        profil.setUserId(userId);
        
        return profil;//To change body of generated methods, choose Tools | Templates.
    }

}
