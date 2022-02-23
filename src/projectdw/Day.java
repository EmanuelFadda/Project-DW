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
    private double c;//close price
    private double h;//highest price
    private double l;//lowest price
    private double o;//open price
    private long t;//

    public double getClosePrice() {
        return c;
    }

    public long getTimeUnixMsec() {
        return t;
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
     * Useful method for debugging
     * @return information of the day
     */
    public String toString() {
        return "Day:\n" + " c = " + this.getClosePrice() + "\n h = " + this.getHighestPrice() + "\n l = " + this.getHighestPrice() + "\n o = " + this.getOpenPrice()+"\n t = "+ this.getTimeUnixMsec();
    }
}
