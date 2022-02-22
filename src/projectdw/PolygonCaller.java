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
public class PolygonCaller { //classe che attraverso i dati presi dal sito nella classe InputSite può elaborare un link per effettuare le richieste precise
    private String APIKeyLog; //key dell'API
    private String stocksTicker; //nome del titolo
    private String start; // data inizio
    private String end; // data fine

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
    
    public String restCall(String link) throws MalformedURLException, IOException{ //metodo che attraverso il link ti effettua la chiamata rest
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

    public String restCallDataStocks() throws IOException{ //ottenimento dei dati del periodo selezionato del titolo borsistico richiesto
        String url="https://api.polygon.io/v2/aggs/ticker/"+this.stocksTicker+"/range/1/day/"+this.modifyStringDate(this.start)+"/"+this.modifyStringDate(this.end)+"?apiKey="+this.APIKeyLog;
 
        return this.restCall(url);
    }
    public String restCallInfoStocks() throws IOException{ //ottenimento dei dati del titolo borsistico scelto
        String url=null;
        //"https://api.polygon.io/v3/reference/tickers/AAPL?apiKey=O7iAXX5ZoaqaMqOzyHA4RPq8LfFw8olK"
        url="https://api.polygon.io/v3/reference/tickers/"+this.stocksTicker+"?apiKey="+this.APIKeyLog;
        return this.restCall(url);
    }
    private String modifyStringDate(String wrongData){ //converte le date presi dal sito di torricelli in delle stringhe idonee all'utilizzo dell'API polygon
        String year=new String(wrongData.substring(6,10));
        String month=new String(wrongData.substring(3,5));
        String day= new String(wrongData.substring(0,2));
        return year+"-"+month+"-"+day;
    }
}
