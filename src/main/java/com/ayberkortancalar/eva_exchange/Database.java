package com.ayberkortancalar.eva_exchange;
import java.sql.*;

public class Database {

    private static String url = "jdbc:postgresql://ec2-54-155-61-133.eu-west-1.compute.amazonaws.com:5432/dc3u0jh7kb9dbi";
    private static Connection connection = null;


    public static void connect() {
        try {
            connection = DriverManager.getConnection(url, "qccqkuiixickmg", "34f07f09f355755a692a005c2f5508ea82f4c251a4fe8ecb324c2bb5adfd6f73");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static Statement getStatement() {
        try {
            Statement st = connection.createStatement();
            return st;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static ResultSet list(String query) {
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String registeredShares = """
            select * from "RegisteredShares"
             """;
    public static String shares = """
            select * from "Shares" Order by "portfolioID"
             """;
}
