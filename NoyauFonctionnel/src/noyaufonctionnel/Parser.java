package noyaufonctionnel;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nicolascapon
 */
public class Parser {

    private URL url;
    private String texte;

    public Parser(URL url) {
        this.url = url;

        try {

            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
            this.texte = "";
            while (input.available() > 0) {
                char b = (char) input.read();
                this.texte = this.texte + Character.toString(b);
                //System.out.print((char) input.read())
            }
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getValue(String name) {
//Cherche dans le texte la valeur dénommée "name" et la retourne dans "value"
        JSONObject obj = new JSONObject(this.texte);
        String value = obj.getString(name);
        return value;
    }

}
