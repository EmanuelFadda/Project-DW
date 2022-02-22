/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdw;

import java.util.ArrayList;

/**
 *
 * @author difin
 */
public class TheoreticalMaximum {
    private ArrayList<Day> arDays;

    /**
     * Constructor that initializes the ArrayList
     * @param arDays 
     */
    public TheoreticalMaximum(ArrayList<Day> arDays) {
        this.arDays = arDays;
    }

    /**
     * Using a for loop to add the difference between the highest and lowest price to a local variable
     * @return the local variable that contains the result of the theoretical maximum achievable
     */
    public int getTheoreticalMaximum(){
        int result = 0;
        for(int i = 0; i < arDays.size(); i++){
            result += arDays.get(i).getHighestPrice()- arDays.get(i).getLowestPrice(); 
        }
        return result;
    }
}
