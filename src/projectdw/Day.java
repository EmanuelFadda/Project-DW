/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdw;

/**
 *
 * @author difin
 */
public class Day {
    private double c;//close prize
    private double h;//highest prize
    private double l;//lowest prize
    private double o;//open priza

    public double getClosePrice() {
        return c;
    }
    
    public double getHighestPrice() {
        return h;
    }

    public double getLowestPrice() {
        return l;
    }

    public double getOpenPrice() {
        return o;
    }

    /**
     * Metodo utile per il debug
     * @return informazioni del giorno
     */
    public String toString() {
        return "Day:\n" + " c = " + this.getClosePrice() + "\n h = " + this.getHighestPrice() + "\n l = " + this.getHighestPrice() + "\n o = " + this.getOpenPrice();
    }
}
