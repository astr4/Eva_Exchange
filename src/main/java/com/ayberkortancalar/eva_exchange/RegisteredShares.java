package com.ayberkortancalar.eva_exchange;

import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

@Repository
public class RegisteredShares {
    private static List<Share>  shares;
    static {

        ResultSet rs = Database.list(Database.registeredShares);
        try {
            while (rs.next()){
                String symbol = rs.getString("symbol");
                double price = rs.getDouble("price");
                double rate = rs.getDouble("rate");
                getShares().add(new Share(symbol,price,rate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i< getShares().size(); i++) {
            System.out.println(getShares().get(i));
        }
    }
    public static List<Share> getShares() {
        if (shares == null) {
            shares = new ArrayList<>();
        }
        return shares;
    }
    public void setShares(List<Share> shares) {
        shares = shares;
    }
}
