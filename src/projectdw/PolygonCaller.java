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
public class PolygonCaller {
    private String APIKeyLog;
    private String stocksTicker;
    private String start;
    private String end;

    public PolygonCaller(String APIKeyLog, String stocksTicker, String start, String end) {
        this.APIKeyLog = APIKeyLog;
        this.stocksTicker = stocksTicker;
        this.start = start;
        this.end = end;
    }

    public String getAPIKeyLog() {
        return APIKeyLog;
    }

    public void setAPIKeyLog(String APIKeyLog) {
        this.APIKeyLog = APIKeyLog;
    }

    public void setStocksTicker(String stocksTicker) {
        this.stocksTicker = stocksTicker;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    public String restCall(String link) throws MalformedURLException, IOException{
        URL url = new URL(link); //prende l'url
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

    public String restCallDataStocks() throws IOException{
        String url="https://api.polygon.io/v2/aggs/ticker/"+this.stocksTicker+"/range/1/day/"+this.start+"/"+this.end+"?apiKey="+this.APIKeyLog;
        System.out.println(url);
        ///https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2020-06-01/2020-06-17?apiKey=O7iAXX5ZoaqaMqOzyHA4RPq8LfFw8olK
        return this.restCall(url);
    }
    public String restCallInfoStocks() throws IOException{
        String url=null;
        //"https://api.polygon.io/v3/reference/tickers/AAPL?apiKey=O7iAXX5ZoaqaMqOzyHA4RPq8LfFw8olK"
        return this.restCall(url);
    }
    
}
