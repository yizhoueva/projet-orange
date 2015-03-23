/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.BodyFat;
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
public class BodyFatDeserialiseur implements JsonDeserializer<BodyFat>{

    @Override
    public BodyFat deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        
        final String id = jsonObject.get("id").getAsString();
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String timestamp = jsonObject.get("timestamp").getAsString();
        final String source = jsonObject.get("source").getAsString();
        final String value = jsonObject.get("value").getAsString();
        final String unit = jsonObject.get("unit").getAsString();
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String updatedAt = jsonObject.get("updatedAt").getAsString();
        
        BodyFat bf = new BodyFat();
        
        bf.setId(id);
        bf.setUserId(userId);
        bf.setHumanId(humanId);
        bf.setTimestamp(timestamp);
        bf.setSource(source);
        bf.setValue(value);
        bf.setUnit(unit);
        bf.setCreatedAt(createdAt);
        bf.setUpdatedAt(updatedAt);
        
        return bf;
    }
    
}
