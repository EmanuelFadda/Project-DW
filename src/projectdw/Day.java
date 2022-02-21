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
    private int closePrice;
    private int highestPrice;
    private int lowestPrice;
    private int numberOfTransactions;
    private int openPrice;
    private int timestamp;
    private int tradingVolume;
    private double volumeWeighted;

    public Day(int closePrice, int highestPrice, int lowestPrice, int numberOfTransactions, int openPrice, int timestamp, int tradingVolume, double volumeWeighted) {
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.numberOfTransactions = numberOfTransactions;
        this.openPrice = openPrice;
        this.timestamp = timestamp;
        this.tradingVolume = tradingVolume;
        this.volumeWeighted = volumeWeighted;
    }

    public Day() {
        this(0,0,0,0,0,0,0,0);
    }

    public int getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(int closePrice) {
        this.closePrice = closePrice;
    }

    public int getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(int highestPrice) {
        this.highestPrice = highestPrice;
    }

    public int getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(int lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public int getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(int openPrice) {
        this.openPrice = openPrice;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(int tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public double getVolumeWeighted() {
        return volumeWeighted;
    }

    public void setVolumeWeighted(double volumeWeighted) {
        this.volumeWeighted = volumeWeighted;
    }   

    public String toString() {
        return "Day:\n" + " - Close Price = " + this.getClosePrice() + "\n - Highest Price = " + this.getHighestPrice() + "\n - Lowest Price = " + this.getLowestPrice() + "\n - Number Of Transactions = " + this.getNumberOfTransactions() + "\n - Open Price = " + this.getOpenPrice() + "\n - Time Stamp = " + this.getTimestamp() + "\n - Trading Volume = " + this.getTradingVolume() + "\n - Volume Weighted = " + this.getVolumeWeighted();
    }
}
