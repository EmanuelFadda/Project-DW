/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author USER
 */
public class InputSite {
    private String siteInput;

    public InputSite(String siteInput) {
        this.siteInput = siteInput;
    }

    public String getSiteInput() {
        return siteInput;
    }

    public void setSiteInput(String siteInput) {
        this.siteInput = siteInput;
    }
    
    public String restCall() throws MalformedURLException, IOException{
        URL url = new URL(this.getSiteInput()); //prende l'url
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
        conn.setRequestMethod("GET"); //setta il tipo della chiamata, in questo caso "get"
        conn.setRequestProperty("Accept", "application/json"); //setta le proprietà 
        if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode()); 
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()))); //inserisce il risultato della risposta nell'oggetto buffered reader
         //stringa del risultato
        String output=br.readLine();
        if(output != null) {
            conn.disconnect(); 
        }
        return output;
    }
 }