/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectdw;

import java.awt.Desktop;
import java.io.File;
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
       InputSite inputSite=new InputSite("https://dwweb.gnet.it/dw2022/");
       System.out.println(inputSite.restCall());
    }
    
}
