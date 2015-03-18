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
import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

public class Coeur implements Serializable {

//    private String id;
//    private String userId;
//    private String timestamp;
//    private int value;
//    private String unit;
//    private String source;
//    private String sourceData;
//    private String createdAt;
//    private String updatedAt;
//    private String humanId;
    private int freqcardio;
    private int systolic;
    private int diastolic;

    public Coeur() throws MalformedURLException {
        URL url1 = new URL("https://api.humanapi.co/v1/human/heart_rate?access_token=demo");
        Parser p1 = new Parser(url1);
        this.freqcardio = p1.getValueInt("value");

        URL url2 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p2 = new Parser(url2);
        this.systolic = p2.getValueInt("systolic");

        URL url3 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p3 = new Parser(url3);
        this.diastolic = p2.getValueInt("diastolic");
    }

    public int getFreqcardio() {
        return freqcardio;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }



}
