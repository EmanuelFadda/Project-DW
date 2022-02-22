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
public class PolygonCaller { // class that through the data taken from the site in the InputSite class can process a link to make precise requests
    private String APIKeyLog; // key of the API
    private String stocksTicker; //title name
    private String start; // start date
    private String end; // end date

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
    
    public String restCall(String link) throws MalformedURLException, IOException{ // method that through the link make a rest call
        URL url = new URL(link); // take the url
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
        conn.setRequestMethod("GET"); // set the type of the call, in this case "get"
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

    public String restCallDataStocks() throws IOException{ // obtaining the data of the selected period of the requested stock market
        String url="https://api.polygon.io/v2/aggs/ticker/"+this.stocksTicker+"/range/1/day/"+this.modifyStringDate(this.start)+"/"+this.modifyStringDate(this.end)+"?apiKey="+this.APIKeyLog;
 
        return this.restCall(url);
    }
    public String restCallInfoStocks() throws IOException{ // obtaining the data of the chosen stock market
        String url=null;
        //"https://api.polygon.io/v3/reference/tickers/AAPL?apiKey=O7iAXX5ZoaqaMqOzyHA4RPq8LfFw8olK"
        url="https://api.polygon.io/v3/reference/tickers/"+this.stocksTicker+"?apiKey="+this.APIKeyLog;
        return this.restCall(url);
    }
    private String modifyStringDate(String wrongData){ // converts the dates taken from torricelli site into strings suitable for the use of the polygon API
        String year=new String(wrongData.substring(6,10));
        String month=new String(wrongData.substring(3,5));
        String day= new String(wrongData.substring(0,2));
        return year+"-"+month+"-"+day;
    }
}
