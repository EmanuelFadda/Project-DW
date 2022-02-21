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
    
    /**
     * Utilizzo un ciclo for per sommare ad una variabile locale la differenza tra il prezzo più alto e quello più basso
     * @return la variabile locale che contiene il calcolo del massimo teorico realizzabile
     */
    public int getTheoreticalMaximum(){
        int result = 0;
        for(int i = 0; i < arDays.size(); i++){
            result += arDays.get(i).getHighestPrice()- arDays.get(i).getLowestPrice(); 
        }
        return result;
    }
    
    /**
     * Calcolo di quanto ha guadagnato o perso il titolo borsistico per il periodo richiesto
     * @return se ha guadagnato o ha perduto
     */
    public int getHowMuch(){
        int result = arDays.get(arDays.size()-1).getClosePrice() - arDays.get(0).getOpenPrice();
        return result;
    }
    
    /**
     * Calcolo della % dei giorni in cui il titolo borsistico è cresciuto
     * @return percentuale giorni di crescita
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
