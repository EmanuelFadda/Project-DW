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
    private ArrayList<Day> results;
    private int theoricalMaximum;
    private int howMuch;
    private double percentage;
    private HashMap<Double, Double> frequentValues;
    
    
    public Elaborations(ArrayList<Day> arDays) {
        this.results = arDays;
    }    

    public ArrayList<Day> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Elaborations{" + "results=" + results + ", theoricalMaximum=" + theoricalMaximum + ", howMuch=" + howMuch + ", percentage=" + percentage + ", frequentValues=" + frequentValues + '}';
    }

    public void setResults(ArrayList<Day> results) {
        this.results = results;
    }

    public int getTheoricalMaximum() {
        return theoricalMaximum;
    }

    public void setTheoricalMaximum(int theoricalMaximum) {
        this.theoricalMaximum = theoricalMaximum;
    }

    public int getHowMuch() {
        return howMuch;
    }

    public void setHowMuch(int howMuch) {
        this.howMuch = howMuch;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public HashMap<Double, Double> getFrequentValues() {
        return frequentValues;
    }

    public void setFrequentValues(HashMap<Double, Double> frequentValues) {
        this.frequentValues = frequentValues;
    }
    
    /**
     * I use a for loop to add the difference between the highest and lowest price to a local variable
     * @return the local variable that contains the calculation of the theoretical maximum achievable
     */
    public void calculateTheoreticalMaximum(){
        int result = 0;
        for(int i = 0; i < results.size(); i++){
            result += results.get(i).getHighestPrice()- results.get(i).getLowestPrice(); 
        }
        this.setTheoricalMaximum(result);
    }
    
    /**
     * Calculation of how much the stock title has gained or lost for the required period
     * @return whether he has gained or lost
     */
    public void calculateHowMuch(){
        int result = (int) (results.get(results.size()-1).getClosePrice() - results.get(0).getOpenPrice());
        this.setHowMuch(result);
    }
    
    /**
     * Calculation of the percentage of days in which the stock market has risen
     * @return percentage of days in which the stock has grown
     */
    public void calculatePercentage(){
        int daysGrowsUp = 0;
        for(int i = 0; i < results.size(); i++){
            if(results.get(i).getOpenPrice() < results.get(i).getClosePrice()){
                daysGrowsUp++;
            }
        }
        this.setPercentage(Double.valueOf(daysGrowsUp/results.size()) * 100);
    }
    
    public void caluculateFrequentValues(){
        HashMap<Double, Double> hashmap = new HashMap<Double, Double>();
        for(int i = 0; i < results.size(); i++){
            //if()
        }
        this.setFrequentValues(hashmap);
    }
}
