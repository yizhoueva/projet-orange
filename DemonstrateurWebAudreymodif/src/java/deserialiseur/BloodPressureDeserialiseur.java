/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.BloodPressure;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romeo
 */
public class BloodPressureDeserialiseur implements JsonDeserializer<BloodPressure> {

    @Override
    public BloodPressure deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();

        final String id = jsonObject.get("id").getAsString();
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String timestamp = jsonObject.get("timestamp").getAsString();
        final String source = jsonObject.get("source").getAsString();
        final int systolic = jsonObject.get("systolic").getAsInt();
        final int diastolic = jsonObject.get("diastolic").getAsInt();
        final String unit = jsonObject.get("unit").getAsString();
        final String heartRate = jsonObject.get("heartRate").getAsString();
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String updatedAt = jsonObject.get("updatedAt").getAsString();

        BloodPressure bp = new BloodPressure();
        bp.setId(id);
        bp.setUserId(userId);
        bp.setHumanId(humanId);
        bp.setTimestamp(timestamp);
        bp.setSource(source);
        bp.setSystolic(systolic);
        bp.setDiastolic(diastolic);
        bp.setUnit(unit);
        bp.setHeartRate(heartRate);
        bp.setHeartRate(heartRate);
        bp.setCreatedAt(createdAt);
        bp.setUpdatedAt(updatedAt);
        
        return bp;
    }

}
