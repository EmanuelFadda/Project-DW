/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectdw;


import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

       PolygonCaller pCaller= new PolygonCaller("Zu3H1W9Hu42COZSkkkb5AxiDBPRfGKg8",g.fromJson(s1, Params.class));
         String str1=pCaller.restCallInfoStocks();
        String str2=pCaller.restCallDataStocks();
 
      InfoStock infoStock=g.fromJson(str1, InfoStock.class);
      Elaborations elaborations=g.fromJson(str2, Elaborations.class );
      OutputDataHTML output=new OutputDataHTML(elaborations,infoStock);
      String filePath = "src\\\\projectdw\\\\HTMLFiles\\\\script.js";
      HTMLLoader html =new HTMLLoader("src\\\\projectdw\\\\HTMLFiles\\\\index.html");
      html.loadFileHTML(output);
    }
    
}
