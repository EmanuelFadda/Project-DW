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
public class InputSite { // Class aimed at requesting parameters (from Torricelli site) for a rescue request to Polygon
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
    
    public String restCall() throws MalformedURLException, IOException{ // make a rest call
        URL url = new URL(this.getSiteInput()); // get the url
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
        conn.setRequestMethod("GET"); // set the type of the call, in this case, "get"
        conn.setRequestProperty("Accept", "application/json"); // set the properties
        if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode()); 
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()))); // put the result of the response into the buffered reader object
        // result string
        String output=br.readLine();
        if(output != null) {
            conn.disconnect(); 
        }
        return output;
    }
 }