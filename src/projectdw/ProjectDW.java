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
       /*System.out.println(inputSite.restCall());*/
       PolygonCaller pCaller= new PolygonCaller("Zu3H1W9Hu42COZSkkkb5AxiDBPRfGKg8","AAPL","01/12/2021","31/12/2021");
       /*System.out.println(pCaller.restCallDataStocks());
       System.out.println(pCaller.restCallInfoStocks());*/
       //System.out.println(pCaller.restCallDataStocks());
         String str=pCaller.restCallDataStocks();
         Elaborations elaborations=g.fromJson(str, Elaborations.class);
        System.out.println(elaborations);
    }
    
}
