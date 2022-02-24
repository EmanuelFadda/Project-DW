/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectdw;


import com.google.gson.Gson;
import java.io.IOException;


/**
 *
 * @author USER
 */
public class ProjectDW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
      Gson g=new Gson();
      InputSite inputSite=new InputSite("https://dwweb.gnet.it/dw2022/");
      String s1=inputSite.restCall();
      PolygonCaller pCaller= new PolygonCaller("Zu3H1W9Hu42COZSkkkb5AxiDBPRfGKg8",g.fromJson(s1, Params.class));
      String str1=pCaller.restCallInfoStocks();
      String str2=pCaller.restCallDataStocks();
      InfoStock infoStock=g.fromJson(str1, InfoStock.class);
      Elaborations elaborations=g.fromJson(str2, Elaborations.class );
      OutputDataHTML output=new OutputDataHTML(elaborations,infoStock);
      HTMLLoader html =new HTMLLoader("src\\\\projectdw\\\\HTMLFiles\\\\index.html");
      html.loadFileHTML(output);
      while(true){
          Thread.sleep(30000);
          s1=inputSite.restCall();
          pCaller= new PolygonCaller("Zu3H1W9Hu42COZSkkkb5AxiDBPRfGKg8",g.fromJson(s1, Params.class));
          str1=pCaller.restCallInfoStocks();
          str2=pCaller.restCallDataStocks();
          infoStock=g.fromJson(str1, InfoStock.class);
          elaborations=g.fromJson(str2, Elaborations.class );
          output=new OutputDataHTML(elaborations,infoStock);
          html.uploadJSONData(g.toJson(output));
      }
      
    }
    
}
