package projectdw;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

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

    public HTMLLoader(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public void loadFileHTML() throws IOException{
        File file=new File(path);
        Desktop desk = Desktop.getDesktop();
        desk.browse(file.toURI());
    }
}
