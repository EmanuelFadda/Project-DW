/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdw;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class OutputDataHTML {
    
    private Elaborations elaborations;
    private InfoStock infoStock;

    @Override
    public String toString() {
        return "OutputDataHTML{" + "elaborations=" + elaborations + ", infoStock=" + infoStock + '}';
    }

    public OutputDataHTML(Elaborations elaborations, InfoStock infoStock) {
        this.elaborations = elaborations;
        this.infoStock = infoStock;
        this.elaborations.calculateHowMuch();
        this.elaborations.calculatePercentage();
        this.elaborations.calculateTheoreticalMaximum();
        this.elaborations.caluculateFrequentValues();
    }
    
    
}
