/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyaufonctionnel;

/**
 *
 * @author Romeo
 */
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import sun.misc.IOUtils;

/**
 *
 * @author Romeo
 */
public class JsonParser {

    public JsonParser() throws IOException {

        InputStream input = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo").openStream();
        Gson gson = new Gson();
        Profil profil = gson.fromJson(input.toString(), Profil.class);
    }
}
