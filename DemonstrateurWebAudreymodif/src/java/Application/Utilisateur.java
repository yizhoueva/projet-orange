/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

/**
 *
 * @author nicolascapon
 */
public class Utilisateur implements Serializable {

    private String name;
    private String email;
    private int poids;
    private String unitPoids;
    private int taille;
    private String unitTaille;
    private int IMC;
    private String unitIMC;
    private int BPM;
    private String unitBPM;
    private int systolic;
    private int diastolic;
    private String tensionUnit;
    private int BO;
    private String unitBO;
    private int BG;
    private String unitBG;
    

    public String getEmail() {
        return email;
    }

    public Utilisateur() throws MalformedURLException {
        URL url = new URL("https://api.humanapi.co/v1/human?access_token=demo");
        Parser p = new Parser(url);
        
        URL url1 = new URL("https://api.humanapi.co/v1/human/weight?access_token=demo");
        Parser p1 = new Parser(url1);
        
        URL url2 = new URL("https://api.humanapi.co/v1/human/height?access_token=demo");
        Parser p2 = new Parser(url2);

        URL url3 = new URL("https://api.humanapi.co/v1/human/BMI?access_token=demo");
        Parser p3 = new Parser(url3);
        
        URL url4 = new URL("https://api.humanapi.co/v1/human/heart_rate?access_token=demo");
        Parser p4 = new Parser(url4);
        
        URL url5 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p5 = new Parser(url5);
        
        URL url6 = new URL("https://api.humanapi.co/v1/human/blood_oxygen?access_token=demo");
        Parser p6 = new Parser(url6);
        
        URL url7 = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser p7 = new Parser(url7);
      //  this.name = p.getValueString("name");
        //this.email = p.getValueString("email");
        
        this.name="UserId";
        this.email="demo@humanapi.co";
        this.poids=p1.getValueInt("value");
        this.unitPoids=p1.getValueString("unit");
        this.taille=p2.getValueInt("value");
        this.unitTaille=p2.getValueString("unit");
        this.IMC=p3.getValueInt("value");
        this.unitIMC=p3.getValueString("unit");
        this.BPM=p4.getValueInt("value");
        this.unitBPM=p4.getValueString("unit");
        this.systolic=p5.getValueInt("systolic");
        this.diastolic=p5.getValueInt("diastolic");
        this.tensionUnit=p5.getValueString("unit");
        this.BO=p6.getValueInt("value");
        this.unitBO=p6.getValueString("unit");
        this.BG=p7.getValueInt("value");
        this.unitBG=p7.getValueString("unit");
        
    }

    /**
     * @return the name
     */
    public String getName() throws MalformedURLException {
        URL url = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser test = new Parser(url);
        String a = test.getValueString(this.name);
        return a;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @return the unitPoids
     */
    public String getUnitPoids() {
        return unitPoids;
    }

    /**
     * @return the taille
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @return the unitTaille
     */
    public String getUnitTaille() {
        return unitTaille;
    }

    /**
     * @return the IMC
     */
    public int getIMC() {
        return IMC;
    }

    /**
     * @return the unitIMC
     */
    public String getUnitIMC() {
        return unitIMC;
    }

    /**
     * @return the BPM
     */
    public int getBPM() {
        return BPM;
    }

    /**
     * @return the unitBPM
     */
    public String getUnitBPM() {
        return unitBPM;
    }

    /**
     * @return the systolic
     */
    public int getSystolic() {
        return systolic;
    }

    /**
     * @return the diastolic
     */
    public int getDiastolic() {
        return diastolic;
    }

    /**
     * @return the tensionUnit
     */
    public String getTensionUnit() {
        return tensionUnit;
    }

    /**
     * @return the BO
     */
    public int getBO() {
        return BO;
    }

    /**
     * @return the unitBO
     */
    public String getUnitBO() {
        return unitBO;
    }

    /**
     * @return the BG
     */
    public int getBG() {
        return BG;
    }

    /**
     * @return the unitBG
     */
    public String getUnitBG() {
        return unitBG;
    }

}
