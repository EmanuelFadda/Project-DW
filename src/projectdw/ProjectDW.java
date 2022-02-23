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
    public static void main(String[] args) throws IOException {
       Gson g=new Gson();
       InputSite inputSite=new InputSite("https://dwweb.gnet.it/dw2022/");
       String s1=inputSite.restCall();
       // System.out.println(s1);
       PolygonCaller pCaller= new PolygonCaller("Zu3H1W9Hu42COZSkkkb5AxiDBPRfGKg8",g.fromJson(s1, Params.class));
      // System.out.println(pCaller.restCallDataStocks());
       //System.out.println(pCaller.restCallInfoStocks());
       //System.out.println(pCaller.restCallDataStocks());
         String str1=pCaller.restCallInfoStocks();
        String str2=pCaller.restCallDataStocks();
       //  System.out.println(pCaller.restCallInfoStocks());
        InfoStock infoStock=g.fromJson(str1, InfoStock.class);
         Elaborations elaborations=g.fromJson(str2, Elaborations.class );
       // System.out.println(infoStock);
      OutputDataHTML output=new OutputDataHTML(elaborations,infoStock);
       System.out.println(output);
       // System.out.println(elaborations);
       // HTMLLoader a=new HTMLLoader("src\\projectdw\\HTMLFiles\\index.html");
       // a.loadFileHTML();
    }
    
}
