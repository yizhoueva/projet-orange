package Application;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
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

    public Parser(URL url) throws IOException {
        this.url = url;

        

            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
//            this.texte = "";
//            while (input.available() > 0) {
//                char b = (char) input.read();
//                this.texte = this.texte + Character.toString(b);
                //System.out.print((char) input.read())
                int nextCharacter; // read() returns an int, we cast it to char later
                this.texte = "";
                
                while (true) { // Infinite loop, can only be stopped by a "break" statement
                    nextCharacter = input.read(); // read() without parameters returns one character
                    if (nextCharacter == -1) // A return value of -1 means that we reached the end
                    {
                        break;
                    }
                    this.texte += (char) nextCharacter; // The += operator appends the character to the end of the string
                }
            
        } 
    

    public String getValueString(String name) {
//Cherche dans le texte la valeur dénommée "name" et la retourne dans "value"
        JSONObject obj = new JSONObject(this.getTexte());
        String value = obj.getString(name);
        return value;
    }

    public String getValueArray(String name) {
//Cherche dans le texte la valeur dénommée "name" et la retourne dans "value"
        String str = this.getTexte();
        JSONObject obj = new JSONObject(str);
        JSONArray arr = obj.getJSONArray(name);
        String value = "";
        for (int i = 0; i < arr.length(); i++) {
            int s = arr.getInt(i);
            value = value + arr.getInt(i);
            System.out.println(arr.getInt(i));
        }
        return value;
    }

    public int getValueInt(String name) {
//Cherche dans le texte la valeur dénommée "name" et la retourne dans "value"
        JSONObject obj = new JSONObject(this.getTexte());
        int value = obj.getInt(name);
        return value;
    }

    /**
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }
}
