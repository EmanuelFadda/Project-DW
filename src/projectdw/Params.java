/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdw;

/**
 *
 * @author USER
 */
public class Params {
    private String ticker;
    private String starting_date;
    private String ending_date;

    public Params(String ticker, String starting_date, String ending_date) {
        this.ticker = ticker;
        this.starting_date = starting_date;
        this.ending_date = ending_date;
    }

    
    public Params(Params x) {
        this(x.ticker, x.starting_date, x.ending_date);
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(String starting_date) {
        this.starting_date = starting_date;
    }

    public String getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(String ending_date) {
        this.ending_date = ending_date;
    }
    
    
    
}
