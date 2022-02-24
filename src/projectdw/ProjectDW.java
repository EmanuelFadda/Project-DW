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
       System.out.println(g.toJson(output));
       
       
       
        //Instantiating the File class
      String filePath = "src\\\\projectdw\\\\HTMLFiles\\\\script.js";
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
      String oldLine = "let JSONData=''";
      String newLine = "let JSONData='"+g.toJson(output)+"'";
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll(oldLine, newLine);
      FileWriter writer = new FileWriter(filePath);
      writer.append(fileContents);
      writer.flush();
      HTMLLoader html =new HTMLLoader("src\\\\projectdw\\\\HTMLFiles\\\\index.html");
      html.loadFileHTML();
      
    }
    
}
