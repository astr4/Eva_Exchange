package com.ayberkortancalar.eva_exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaExchangeApplication {

    public static void main(String[] args) {
        Database.connect();
        SpringApplication.run(EvaExchangeApplication.class, args);

    }

}
