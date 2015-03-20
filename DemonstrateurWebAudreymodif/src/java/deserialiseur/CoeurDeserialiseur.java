/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import Application.Coeur2;

/**
 *
 * @author Romeo
 */
public class CoeurDeserialiseur implements JsonDeserializer<Coeur2> {

    @Override
    public Coeur2 deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonArray liste = json.getAsJsonArray();
        
        
        int value;
        int size=liste.size();
        int[] values = new int[size];
        
        for (int i = 0; i < size; i++) {
//            value = liste.get(i).getAsJsonObject().get("value").getAsInt();
//            System.out.println(value);
//            values[i] = value;
//            
        }
        
        Coeur2 coeur = new Coeur2();
        coeur.setHeartRates(values);
        
        
        
        return coeur;

    }
}
