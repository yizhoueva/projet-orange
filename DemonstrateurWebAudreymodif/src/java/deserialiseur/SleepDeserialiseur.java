/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.Sleep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author Romeo
 */
public class SleepDeserialiseur implements JsonDeserializer<Sleep>{

    @Override
    public Sleep deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        
         final JsonObject jsonObject = json.getAsJsonObject();
        
        final String id = jsonObject.get("id").getAsString();
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String date = jsonObject.get("date").getAsString();
        final String source = jsonObject.get("source").getAsString();
        final String timeAsleep = jsonObject.get("timeAsleep").getAsString();
        final String timeAwake = jsonObject.get("timeAwake").getAsString();
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String updatedAt = jsonObject.get("updatedAt").getAsString();
        
        Sleep s = new Sleep();
        s.setId(id);
        s.setUserId(userId);
        s.setDate(date);
        s.setHumanId(humanId);
        s.setSource(source);
        s.setTimeAsleep(timeAsleep);
        s.setTimeAwake(timeAwake);
        s.setCreatedAt(createdAt);
        s.setUpdatedAt(updatedAt);
        
        return s;
    }
    
}
