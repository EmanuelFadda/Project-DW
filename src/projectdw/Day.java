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
    private double l; //lowest prize
    private double o;// open priza

    @Override
    public String toString() {
        return "Day{" + "c=" + c + ", h=" + h + ", l=" + l + ", o=" + o + '}';
    }

    public double getClosePrice() {
        return c;
    }

  

    public double getHighestPrice() {
        return h;
    }

    public double getLowestPric() {
        return l;
    }



    public double getOpenPrice() {
        return o;
    }

 
    

    
}
