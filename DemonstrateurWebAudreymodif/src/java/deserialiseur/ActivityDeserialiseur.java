/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.Activity;
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
public class ActivityDeserialiseur implements JsonDeserializer<Activity> {

    @Override
    public Activity deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();
        Activity a = new Activity();

        final String id = jsonObject.get("id").getAsString();
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String startTime = jsonObject.get("startTime").getAsString();
        final String endTime = jsonObject.get("endTime").getAsString();
        final String tzOffset = jsonObject.get("tzOffset").getAsString();
        final String typeOfActivity = jsonObject.get("type").getAsString();
        final String source = jsonObject.get("source").getAsString();
        final String duration = jsonObject.get("duration").getAsString();
        final String distance = jsonObject.get("distance").getAsString();
        final String steps = jsonObject.get("steps").getAsString();
        final String calories = jsonObject.get("calories").getAsString();
        final JsonElement sourceData = jsonObject.get("sourceData");
        if (sourceData.getAsJsonObject().get("manual") != null) {
            final String sourceDataManual = sourceData.getAsJsonObject().get("manual").getAsString();
            a.setSourceData(sourceDataManual);
        }
        if (jsonObject.get("timeSeries") != null) {
            final String timeSeries = jsonObject.get("timeSeries").getAsString();
            a.setTimeSeries(timeSeries);
        }
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String updatedAt = jsonObject.get("updatedAt").getAsString();

        a.setId(id);
        a.setUserId(userId);
        a.setHumanId(humanId);
        a.setStartTime(startTime);
        a.setEndTime(endTime);
        a.setTzOffset(tzOffset);
        a.setType(typeOfActivity);
        a.setSource(source);
        a.setDuration(duration);
        a.setDistance(distance);
        a.setSteps(steps);
        a.setCalories(calories);
        a.setCreatedAt(createdAt);
        a.setUpdatedAt(updatedAt);

        return a;

    }

}
