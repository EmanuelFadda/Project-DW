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

    public TheoreticalMaximum(ArrayList<Day> arDays) {
        this.arDays = arDays;
    }

    public int getTheoreticalMaximum(){
        int result = 0;
        for(int i = 0; i < arDays.size(); i++){
            result += arDays.get(i).getHighestPrice()- arDays.get(i).getLowestPrice(); 
        }
        return result;
    }
}
