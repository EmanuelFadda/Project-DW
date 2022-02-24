package projectdw;

import com.google.gson.Gson;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class HTMLLoader {
    private String path;
    private String scriptPath;

    public HTMLLoader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getScriptPath() {
        return scriptPath;
    }

    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }
    
    public void  uploadJSONData(String JSONData) throws FileNotFoundException, IOException{
      String filePath = "src\\\\projectdw\\\\HTMLFiles\\\\script.js";
      Scanner sc = new Scanner(new File(filePath));
      StringBuffer buffer = new StringBuffer();
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      sc.close();
      String oldLine = "let JSONData=''";
      String newLine = "let JSONData='"+JSONData+"'";
      fileContents = fileContents.replaceAll(oldLine, newLine);
      FileWriter writer = new FileWriter(filePath);
      writer.append(fileContents);
      writer.flush();
    }
    
    public void loadFileHTML(OutputDataHTML output) throws IOException{
        Gson g=new Gson();
        this.uploadJSONData(g.toJson(output));
        File file=new File(path);
        Desktop desk = Desktop.getDesktop();
        desk.browse(file.toURI());
    }
}
