/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdw;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author difin
 */
public class Elaborations {
    private ArrayList<Day> arDays;

    public Elaborations(ArrayList<Day> arDays) {
        this.arDays = arDays;
    }

    @Override
    public String toString() {
        return "Elaborations{" + "arDays=" + arDays + '}';
    }
    
    /**
     * I use a for loop to add the difference between the highest and lowest price to a local variable
     * @return the local variable that contains the calculation of the theoretical maximum achievable
     */
    public int getTheoreticalMaximum(){
        int result = 0;
        for(int i = 0; i < arDays.size(); i++){
            result += arDays.get(i).getHighestPrice()- arDays.get(i).getLowestPrice(); 
        }
        return result;
    }
    
    /**
     * Calculation of how much the stock title has gained or lost for the required period
     * @return whether he has gained or lost
     */
    public int getHowMuch(){
        int result = (int) (arDays.get(arDays.size()-1).getClosePrice() - arDays.get(0).getOpenPrice());
        return result;
    }
    
    /**
     * Calculation of the percentage of days in which the stock market has risen
     * @return percentage of days in which the stock has grown
     */
    public double percentage(){
        int daysGrowsUp = 0;
        for(int i = 0; i < arDays.size(); i++){
            if(arDays.get(i).getOpenPrice() < arDays.get(i).getClosePrice()){
                daysGrowsUp++;
            }
        }
        return Double.valueOf(daysGrowsUp/arDays.size()) * 100;
    }
    
    public HashMap<Double, Double> frequentValues(){
        HashMap<Double, Double> hashmap = new HashMap<Double, Double>();
        for(int i = 0; i < arDays.size(); i++){
            //if()
        }
        return null;
    }
}
