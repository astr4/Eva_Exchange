package com.ayberkortancalar.eva_exchange;


public class Share {

    private String symbol;
    private double price;
    private double rate;

    @Override
    public String toString() {
        return "Share{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }

    public Share(String symbol, double price, double rate) {
        this.symbol = symbol;
        this.price = price;
        this.rate = rate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        if (symbol.length()==3)
            this.symbol = symbol.toUpperCase();
    }

    public double getPrice() {
        return price;
    }

    public double getRate() {
        return rate;
    }
}
