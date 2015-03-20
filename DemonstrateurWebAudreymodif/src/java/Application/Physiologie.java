/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Romeo
 */

import java.io.Serializable;
import java.net.URL;
import java.net.MalformedURLException;

public class Physiologie implements Serializable {
    private int glycemie;
    private int sat;
    private int tensionS;
    private int tensionD;
    private int imc;
    private int poids;
    private int taille;
    private int graisse;
    
    public Physiologie() throws MalformedURLException{
        //récupérer la dernière valeur de la glycémie
        URL url = new URL("https://api.humanapi.co/v1/human/blood_glucose?access_token=demo");
        Parser p = new Parser(url);
        this.glycemie= p.getValueInt("value");
        
        //récupérer la dernière valeure de la saturation en oxygene
        URL url2 = new URL("https://api.humanapi.co/v1/human/blood_oxygen?access_token=demo");
        Parser p2 = new Parser(url2);
        this.sat= p2.getValueInt("value");
        
         //récupérer la dernière valeure de la tensions systolique
        URL url3 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p3 = new Parser(url3);
        this.tensionS= p3.getValueInt("systolic");
        
         //récupérer la dernière valeure de la tension diastolique
        URL url4 = new URL("https://api.humanapi.co/v1/human/blood_pressure?access_token=demo");
        Parser p4 = new Parser(url4);
        this.tensionD= p4.getValueInt("diastolic");
        
         //récupérer la dernière valeure de l'imc
        URL url5 = new URL("https://api.humanapi.co/v1/human/bmi?access_token=demo");
        Parser p5 = new Parser(url5);
        this.imc= p5.getValueInt("value");
        
         //récupérer la dernière valeure du poids
        URL url6 = new URL("https://api.humanapi.co/v1/human/weight?access_token=demo");
        Parser p6 = new Parser(url6);
        this.poids= p6.getValueInt("value");
        
        //récupérer la dernière valeure de la taille
        URL url7 = new URL("https://api.humanapi.co/v1/human/height?access_token=demo");
        Parser p7 = new Parser(url7);
        this.taille= p7.getValueInt("value");
        
         //récupérer la dernière valeure de la masse graisseuse
        URL url8 = new URL("https://api.humanapi.co/v1/human/body_fat?access_token=demo");
        Parser p8 = new Parser(url8);
        this.graisse= p8.getValueInt("value");
       
    }
    
    public int getGlycemie(){
        return glycemie;
    }

    /**
     * @return the sat
     */
    public int getSat() {
        return sat;
    }

    

    /**
     * @return the imc
     */
    public int getImc() {
        return imc;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @return the tensionS
     */
    public int getTensionS() {
        return tensionS;
    }

    /**
     * @return the tensionD
     */
    public int getTensionD() {
        return tensionD;
    }

    /**
     * @return the taille
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @return the graisse
     */
    public int getGraisse() {
        return graisse;
    }
}
