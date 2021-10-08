package com.ayberkortancalar.eva_exchange;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private int ID;
    private List<Share> shares;

    @Override
    public String toString() {
        return "Portfolio{" +
                "ID=" + ID +
                ", shares=" + shares +
                '}';
    }

    public Portfolio(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public  List<Share> getShares() {
        if (shares == null) {
            shares = new ArrayList<>();
        }
            return shares;
    }
}
