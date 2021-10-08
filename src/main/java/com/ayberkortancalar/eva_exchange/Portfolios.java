package com.ayberkortancalar.eva_exchange;

import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Portfolios {
    private static List<Portfolio> portfolios;

    static {
        ResultSet rs = Database.list(Database.shares);
        boolean isFound = false;
        try {
            while (rs.next()){
                int id = rs.getInt("portfolioID");
                System.out.println(id);
                String symbol = rs.getString("symbol");
                double price = rs.getDouble("price");
                double rate = rs.getDouble("rate");

                for (Portfolio portfolio : getPortfolios()) {
                    if (portfolio.getID() == id) {
                        isFound = true;
                        break;
                    }
                    isFound = false;
                }
                if (!isFound) {
                    getPortfolios().add(new Portfolio(id));
                    isFound=true;
                }
                getPortfolios().get(id-1).getShares().add(new Share(symbol,price,rate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i< getPortfolios().size(); i++) {
            System.out.println(getPortfolios().get(i));
        }
    }
    public static List<Portfolio> getPortfolios()
    {
        if (portfolios == null) {

            portfolios = new ArrayList<>();
        }
        return portfolios;
    }
    public void setPortfolios(
            List<Portfolio> portfolios)
    {
        Portfolios.portfolios = portfolios;
    }
}
