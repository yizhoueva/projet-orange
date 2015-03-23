/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.BloodGlucose;
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
public class BloodGlucoseDeserialiseur implements JsonDeserializer<BloodGlucose> {

    @Override
    public BloodGlucose deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();
        BloodGlucose bg = new BloodGlucose();

        final String id = jsonObject.get("id").getAsString();
        final String userId = jsonObject.get("userId").getAsString();
        final String humanId = jsonObject.get("humanId").getAsString();
        final String timestamp = jsonObject.get("timestamp").getAsString();
        final String source = jsonObject.get("source").getAsString();
        final String value = jsonObject.get("value").getAsString();
        final String unit = jsonObject.get("unit").getAsString();
        if (jsonObject.get("notes") != null) {
            final String notes = jsonObject.get("notes").getAsString();
            bg.setNotes(notes);

        }
        if (jsonObject.get("mealTag") != null) {
            final String mealTag = jsonObject.get("mealTag").getAsString();
            bg.setMealTag(mealTag);
        }
        if (jsonObject.get("medicationTag") != null) {
            final String medicationTag = jsonObject.get("medicationTag").getAsString();
            bg.setMedicationTag(medicationTag);
        }
        final String createdAt = jsonObject.get("createdAt").getAsString();
        final String updatedAt = jsonObject.get("updatedAt").getAsString();

        bg.setId(id);
        bg.setUserId(userId);
        bg.setHumanId(humanId);
        bg.setTimestamp(timestamp);
        bg.setSource(source);
        bg.setValue(value);
        bg.setUnit(unit);
        bg.setCreatedAt(createdAt);
        bg.setUpdatedAt(updatedAt);

        return bg;

    }

}
