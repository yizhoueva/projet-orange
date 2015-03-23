/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.HeartRate;
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
public class HeartRateDeserialiseur implements JsonDeserializer<HeartRate> {

    @Override
    public HeartRate deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        
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
        
        HeartRate hr = new HeartRate();
        
        hr.setId(id);
        hr.setUserId(userId);
        hr.setHumanId(humanId);
        hr.setTimestamp(timestamp);
        hr.setSource(source);
        hr.setValue(value);
        hr.setUnit(unit);
        hr.setCreatedAt(createdAt);
        hr.setUpdatedAt(updatedAt);
        
        return hr;
        
    }
    
}
