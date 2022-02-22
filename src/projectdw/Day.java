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
    private double closePrice;
    private double highestPrice;
    private double lowestPrice;
    private double numberOfTransactions;
    private double openPrice;
    private int timestamp;
    private double tradingVolume;
    private double volumeWeighted;

    /**
     * Constructor with all parameters
     * @param closePrice
     * @param highestPrice
     * @param lowestPrice
     * @param numberOfTransactions
     * @param openPrice
     * @param timestamp
     * @param tradingVolume
     * @param volumeWeighted 
     */
    public Day(double closePrice, double highestPrice, double lowestPrice, double numberOfTransactions, double openPrice, int timestamp, double tradingVolume, double volumeWeighted) {    
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.numberOfTransactions = numberOfTransactions;
        this.openPrice = openPrice;
        this.timestamp = timestamp;
        this.tradingVolume = tradingVolume;
        this.volumeWeighted = volumeWeighted;
    }

    /**
     * Default constructor
     */
    public Day() {
        this(0,0,0,0,0,0,0,0);
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public double getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(double numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public double getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(double tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public double getVolumeWeighted() {
        return volumeWeighted;
    }

    public void setVolumeWeighted(double volumeWeighted) {
        this.volumeWeighted = volumeWeighted;
    }

    /**
     * I print and view the information relating to the 'Day'
     * @return attributes of the day
     */
    public String toString() {
        return "\nDay:\n" + " - Close Price = " + this.getClosePrice() + "\n - Highest Price = " + this.getHighestPrice() + "\n - Lowest Price = " + this.getLowestPrice() + "\n - Number Of Transactions = " + this.getNumberOfTransactions() + "\n - Open Price = " + this.getOpenPrice() + "\n - Time Stamp = " + this.getTimestamp() + "\n - Trading Volume = " + this.getTradingVolume() + "\n - Volume Weighted = " + this.getVolumeWeighted();
    }
}
