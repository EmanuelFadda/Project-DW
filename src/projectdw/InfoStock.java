/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdw;

/**
 *
 * @author USER
 */
public class InfoStock {
    private String symbol; 
    private String exchange;  
    private String name; 
    private String hq_address; 
    private String description; 

    @Override
    public String toString() {
        return "InfoStock{" + "symbol=" + symbol + ", exchange=" + exchange + ", name=" + name + ", hq_address=" + hq_address + ", description=" + description + '}';
    }
    
}
