/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserialiseur;

import agregateur.Genetics;
import com.google.gson.JsonArray;
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
public class GeneticsDeserialiseur implements JsonDeserializer<Genetics> {

    @Override
    public Genetics deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();

        int sizePossibleTraits;

        Genetics g;
        String userId;
        String humanId;
        String trait;
        String description="Pas de description";
        String possibleTrait;
        String[] possibleTraits;
        ;

        userId = jsonObject.get("userId").getAsString();
        humanId = jsonObject.get("humanId").getAsString();
        trait = jsonObject.get("trait").getAsString();
        if (jsonObject.get("description") != null) {
            description = jsonObject.get("description").getAsString();
        }
        JsonArray possibleTraitsArray = jsonObject.getAsJsonArray("possibleTraits");
        sizePossibleTraits = possibleTraitsArray.size();
        possibleTraits = new String[sizePossibleTraits];
        for (int j = 0; j < possibleTraits.length; j++) {
            possibleTrait = possibleTraitsArray.get(j).getAsString();
            possibleTraits[j] = possibleTrait;

        }

        g = new Genetics();

        g.setUserId(userId);
        g.setHumanId(humanId);
        g.setTrait(trait);
        g.setDescription(description);
        g.setPossibleTraits(possibleTraits);

        return g;

    }

}
