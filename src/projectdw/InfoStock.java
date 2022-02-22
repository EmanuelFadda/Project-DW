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
    private String hq_addres; 
    private String description; 

    @Override
    public String toString() {
        return "InfoStock{" + "symbol=" + symbol + ", exchange=" + exchange + ", name=" + name + ", hq_addres=" + hq_addres + ", description=" + description + '}';
    }
    
}
